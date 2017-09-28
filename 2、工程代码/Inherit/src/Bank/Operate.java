package Bank;

public class Operate {
    public static void main(String[] args) {
        int amount=8000;
        ConstructionBank constructionBank=new ConstructionBank(amount,8.236,0.035);
        double constructionBankInterest=constructionBank.computeInterest();
        BankOfDalian bankOfDalian=new BankOfDalian(amount,8.236,0.035);
        double bankOfDalianInterest=bankOfDalian.computeInterest();
        System.out.println("两个银行的利息差为："+(bankOfDalianInterest-constructionBankInterest)+"元。");
    }
}
