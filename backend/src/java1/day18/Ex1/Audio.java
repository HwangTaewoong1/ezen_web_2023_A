package java1.day18.Ex1;

public class Audio implements RemoteControl {
	
	// 필드
	private int volume; // 인스턴스 필드
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if ( volume > RemoteControl.MAX_VOLUME ) {
			// 만약에 볼륨이 최대볼륨보다 크면
			this.volume = RemoteControl.MAX_VOLUME; // this : 해당메소드를 호출한 객체 뜻 , 
			// 해당 객체는 최대볼륨으로 대입
		}else if ( volume < RemoteControl.MIN_VOLUME) {
			// 만약에 볼륨이 최소볼륨보다 작으면
			this.volume = RemoteControl.MIN_VOLUME;
			// 해당 객체는 최소볼륨으로 대입/설정
		}else { this.volume = volume; } // 그 외는 볼륨 그대로 대입
		System.out.println("현재 Audio 볼륨 : " + this.volume );
	}
}
