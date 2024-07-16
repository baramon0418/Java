
public class Television {
	private int channel = 7; //채널 번호, 7로 초기화
	private int volume; //볼륨
	private boolean onOff; //전원 상태
	
	public Television() {
		this(1,1,false);
//		channel = 1;
//		volume = 1;
//		onOff = false;
	}
	
	public Television(int c) {
		this(c,1,false);
	}
	
	public Television(int c, int v) {
		this(c,v,false);
	}
	
	//생성자 (int c, int v, boolean o)
	public Television(int c, int v, boolean o) {
		this.channel = c;
		this.volume = v;
		onOff = o;
	}

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
