package Bank;

public class Bank {
    protected int savedMoney;
    protected int year;
    protected double interest;

    public double computeInterest(){
        interest=year*0.35*savedMoney;
        return interest;
    }

    public Bank(int savedMoney, int year, double interest){
        this.savedMoney=savedMoney;
        this.year=year;
        this.interest=interest;
    }

//    Bank(){
//
//    }
}
//
//
//public class Bank {
//    int savedMoney;
//    int year;
//    double interest;
//    double interestRate = 0.29;
//    public double computerInterest() {
//        interest=year*interestRate*savedMoney;
//        return interest;
//    }
//    public void setInterestRate(double rate) {
//        interestRate = rate;
//    }
//}