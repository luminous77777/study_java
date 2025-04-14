package lesson07;

public class Tv {
	//필드(멤버 변수)
	//필요 요소
	//전원 상태, 채널, 볼륨
	
	//메서드(함수, 혹은 기능)
	//전원조절, 채널업, 다운, 볼륨업, 다운의 총5개 기능
	
	 //호출 가능한 맵버의 개수 8개
	boolean power; // 파워의 기본값 false
	int channel;
	int volume;
	
	//기능 구현
	
	void doPower() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	
	void volumeUp() {
		volume++;
	}
	
	void volumeDown() {
		volume--;
	}
}
