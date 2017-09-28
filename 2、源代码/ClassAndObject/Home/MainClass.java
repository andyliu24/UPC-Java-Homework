
public class MainClass {

	public static void main(String[] args) {
		TV haierTV=new TV();
		Family zhangSanFamily=new Family();
		zhangSanFamily.buyTV(haierTV);
		
		System.out.println("将频道设置为12；");
		zhangSanFamily.remoteControl(12);
		System.out.println("电视当前频道为"+haierTV.getChannel()+"。\n");
		
		System.out.println("张三家在观看电视。");
		zhangSanFamily.seeTV();
	}

}
