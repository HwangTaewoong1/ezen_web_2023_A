package 과제.팀과제2;

public class App {

	private String name;
	private int batteryDesc;
	
	public App(String name, int batteryDesc) {
		this.name = name; 
		this.batteryDesc = batteryDesc;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBatteryDesc() {
		return batteryDesc;
	}

	public void setBatteryDesc(int batteryDesc) {
		this.batteryDesc = batteryDesc;
	}
	
	public int namePrint() {
		System.out.println(name + " 실행");
		return batteryDesc;
	}
	
}
