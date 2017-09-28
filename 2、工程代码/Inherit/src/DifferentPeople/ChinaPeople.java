package DifferentPeople;

public class ChinaPeople extends People{
    public void chinaGongfu(){
        System.out.println("坐如钟，站如松，睡如弓！");
    }

    @Override
    public void speakHello() {
        System.out.println("你好！");
    }
    @Override
    public void averageHeight() {
        System.out.println("中国人的平均身高是1.718m。");
    }
    @Override
    public void averageWeight() {
        System.out.println("中国人的平均体重为72.6kg。");
    }
}
