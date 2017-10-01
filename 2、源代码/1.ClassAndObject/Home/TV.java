
public class TV {
	private int channel;
	
	TV(){
		channel=1;
	}
	void setChannel(int num) {
		if(num<1) {
			System.out.println("电视表示没有频道为负数的情况，已经回到频道1.");
			channel=1;
		}
		channel=num;
	}
	int getChannel() {
		return channel;
	}
	void showProgram(){
		System.out.println("正在播放节目");
	}
	
}
