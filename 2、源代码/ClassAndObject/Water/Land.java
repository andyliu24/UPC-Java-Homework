
public class Land {

	public static void main(String[] args) {
		Village.waterAmount=0;
		
		Village A=new Village();
		Village B=new Village();

		System.out.println("A村庄加入了100的水。");
		A.changeWaterAmount(100);
		System.out.println("B村庄查看水量。");
		System.out.println("B查看水量："+B.showWaterAmount());

	}

}
