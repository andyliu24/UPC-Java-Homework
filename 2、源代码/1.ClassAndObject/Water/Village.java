
public class Village {
	static int waterAmount;
	
	void changeWaterAmount(int delta) {
		waterAmount+=delta;
	}
	int showWaterAmount() {
		return waterAmount;
	}
}
