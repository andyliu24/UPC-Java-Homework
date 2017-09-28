package Bank;

public class BankOfDalian extends Bank {
    protected double year;

    BankOfDalian(int savedMoney, double year, double interest){
        super(savedMoney, (int)year, interest);
        this.year=year;
    }
    public double computeInterest(){
        super.year=(int)year;
        double yearAfterDot=year-(int)year;
        int day=(int)(yearAfterDot*1000);
        double yearInterest=super.computeInterest();
        double dayInterest=day*0.00012*savedMoney;
        interest=yearInterest+dayInterest;
        System.out.println(savedMoney+"元在大连银行存"+super.year+"年"+day+"天的利息为"+interest+"元。");
        return interest;
    }

}
