package 과제.팀과제2;

public class Battery {
	public int capacity = 100;
	
	public void capacityMinus(int batteryDesc ) { // 배터리 감소 함수 , int로 배터리 감소량과 , 레벨(선풍기 단계 입력값)을 받아 전체 배터리에서 감소한다.
		capacity-= batteryDesc;
		if(capacity <0) {capacity = 0;}
	}
	
	public void capacityPlus() {
		while(true) {
			capacity+=1;
			if(capacity >= 100) {
				capacity = 100; 
				System.out.println("배터리 충전 완료");
				return;
			}
			System.out.println("충전중 : " + capacity + "%");
		}
	}
}
