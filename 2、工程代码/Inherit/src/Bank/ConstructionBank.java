package Bank;


public class ConstructionBank extends Bank{
    protected double year;

    ConstructionBank(int savedMoney,double year,double interest){
        super(savedMoney,(int)year,interest);
        this.year=year;
    }
    public double computeInterest(){
        super.year=(int)year;
        double yearAfterDot=year-(int)year;
        int day=(int)(yearAfterDot*1000);
        double yearInterest=super.computeInterest();
        double dayInterest=day*0.0001*savedMoney;
        interest=yearInterest+dayInterest;
        System.out.println(savedMoney+"元在建设银行存"+super.year+"年"+day+"天的利息为"+interest+"元。");
        return interest;
    }


}
