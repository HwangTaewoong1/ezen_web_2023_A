let tableBody = document.getElementById('table-body');
    let dates = [];
    let items = [];
    let amounts = [];

    function addItem() {
      let dateInput = document.getElementById('date-input');
      let itemInput = document.getElementById('item-input');
      let amountInput = document.getElementById('amount-input');

      let date = dateInput.value;
      let item = itemInput.value;
      let amount = parseInt(amountInput.value.replace(/,/g, ''));

      if (!date || !item || isNaN(amount)) {
        return;
      }

      dates.push(date);
      items.push(item);
      amounts.push(amount);

      dateInput.value = '';
      itemInput.value = '';
      amountInput.value = '';

      renderTable();
      calculateTotal();
    }

    function deleteItem(index) {
      dates.splice(index, 1);
      items.splice(index, 1);
      amounts.splice(index, 1);

      renderTable();
      calculateTotal();
    }

    function renderTable() {
      tableBody.innerHTML = '';

      for (let i = 0; i < dates.length; i++) {
        let row = document.createElement('tr');

        let dateCell = createCell(dates[i]);
        let itemCell = createCell(items[i]);
       	let amountCell = createCell(amounts[i].toLocaleString());
        let deleteCell = createCell();
        let deleteButton = document.createElement('button');

        deleteButton.textContent = '삭제';
        deleteButton.classList.add('delete-button');
         deleteButton.onclick = function () {
          deleteItem(i);
        };

        deleteCell.appendChild(deleteButton);

        row.appendChild(dateCell);
        row.appendChild(itemCell);
        row.appendChild(amountCell);
        row.appendChild(deleteCell);

        tableBody.appendChild(row);
      }
    }

    function createCell(text) {
      let cell = document.createElement('td');
      cell.textContent = text || '';
      return cell;
    }

    function calculateTotal() {
      let totalAmount = amounts.reduce((acc, cur) => acc + cur, 0);
      document.getElementById('total-amount').textContent = totalAmount.toLocaleString();
      }