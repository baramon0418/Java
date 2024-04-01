
public class Television {
	private int channel; //채널 번호
	int volume; //볼륨
	boolean onOff; //전원 상태

	void print() {
		System.out.println("텔레비전의 채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
	
	int getChannel() { //위의 channel이 int라서 얘도 int임
		return channel;
	}
	
	void setChannel(int newChannel) {
		channel = newChannel;
		if(newChannel < 1) newChannel = 7;
	}
		
}
