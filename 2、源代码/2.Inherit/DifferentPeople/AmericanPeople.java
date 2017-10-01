package DifferentPeople;

public class AmericanPeople extends People{
    public void americanBoxing(){
        System.out.println("直拳，勾拳，组合拳。");
    }

    @Override
    public void speakHello() {
        System.out.println("Hello!");
    }

    @Override
    public void averageHeight() {
        System.out.println("American's average height is 176 cm.");
    }

    @Override
    public void averageWeight() {
        System.out.println("American's average weight is 75 kg.");
    }
}
