let posts = []; // 글 목록을 저장할 배열
    let currentPost = null; // 현재 선택된 글

    // 글 등록 함수
    function addPost() {
      const writer = document.getElementById('writer').value;
      const password = document.getElementById('password').value;
      const title = document.getElementById('title').value;
      const content = document.getElementById('content').value;
      const date = new Date().toLocaleDateString();
      const views = 0;

      const post = {
        writer,
        password,
        title,
        content,
        date,
        views
      };

      posts.push(post);
      renderPostList();
      clearInputs();
    }

    // 글 목록을 화면에 렌더링하는 함수
    function renderPostList() {
      const postList = document.getElementById('postList');
      postList.innerHTML = '';

      for (let i = 0; i < posts.length; i++) {
        const post = posts[i];
        const row = document.createElement('tr');
        row.innerHTML = `
          <td>${i + 1}</td>
          <td><a href="#" onclick="viewPost(${i})">${post.title}</a></td>
          <td>${post.writer}</td>
          <td>${post.date}</td>
          <td>${post.views}</td>
        `;
        postList.appendChild(row);
      }
    }

    // 글 보기 함수
    function viewPost(index) {
      const post = posts[index];
      post.views++;
      currentPost = post;

      renderPostDetails();
      renderPostList();
    }

    // 글 상세 정보를 화면에 렌더링하는 함수
    function renderPostDetails() {
      const postDetails = document.getElementById('postDetails');
      postDetails.innerHTML = '';

      const title = document.createElement('h3');
      title.textContent = currentPost.title;
      postDetails.appendChild(title);

      const content = document.createElement('p');
      content.textContent = currentPost.content;
      postDetails.appendChild(content);

      const writer = document.createElement('p');
      writer.textContent = `작성자: ${currentPost.writer}`;
      postDetails.appendChild(writer);
    }

    // 글 삭제 함수
    function deletePost() {
      const password = prompt('비밀번호를 입력하세요.');

      if (password === currentPost.password) {
        const index = posts.indexOf(currentPost);
        posts.splice(index, 1);
        currentPost = null;

        renderPostList();
        clearPostDetails();
      } else {
        alert('비밀번호가 일치하지 않습니다.');
      }
    }

    // 입력 필드 초기화 함수
    function clearInputs() {
      document.getElementById('writer').value = '';
      document.getElementById('password').value = '';
      document.getElementById('title').value = '';
      document.getElementById('content').value = '';
    }

    // 글 상세 정보 초기화 함수
    function clearPostDetails() {
      const postDetails = document.getElementById('postDetails');
      postDetails.innerHTML = '';
    }

    // 초기화 함수
    function init() {
      renderPostList();
    }

    init();
 