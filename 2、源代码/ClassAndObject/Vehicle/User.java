
public class User {
	
	public static void main(String[] args) {
		Vehicle lmxscar = new Vehicle();
		System.out.println("成功初始化了一个新的机车。");
		System.out.println("机车当前的功率为："+lmxscar.getPower());
		System.out.println("机车当前的速率为："+lmxscar.getSpeed());
		
		System.out.println("\n"+"机车功率设定为100.");
		lmxscar.setPower(100);
		System.out.println("机车当前的功率为："+lmxscar.getPower());
		
		System.out.println("\n"+"机车速度提高50.");
		lmxscar.speedUp(50);
		System.out.println("机车当前的速率为："+lmxscar.getSpeed());
		
		System.out.println("\n"+"机车速度降低30.");
		lmxscar.speedDown(30);
		System.out.println("机车当前的速率为："+lmxscar.getSpeed());

	}
	
}
