
public class Vehicle {
	
	private double speed;
	private int power;
	
	Vehicle(){
		speed=0;
		power=0;
	}
	void speedUp(int s) {
		speed+=s;
	}
	void speedDown(int s) {
		speed-=s;
	}
	void setPower(int p) {
		power=p;
	}
	double getSpeed() {
		return speed;
	}
	int getPower() {
		return power;
	};


}
