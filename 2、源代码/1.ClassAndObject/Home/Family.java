
public class Family {
	private TV homeTV;
	
	void buyTV(TV t) {
		homeTV=t;
	}
	void remoteControl(int channel){
		homeTV.setChannel(channel);
	}
	void seeTV() {
		homeTV.showProgram();
	}
	
}
