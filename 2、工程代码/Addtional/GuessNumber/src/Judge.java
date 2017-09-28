public class Judge {

    private int inputNumber;
    private RandomNum randomNum;

    Judge(int inputNumber, RandomNum randomNum){
        this.inputNumber=inputNumber;
        this.randomNum=randomNum;
    }

    public boolean toJudge(){
        if(inputNumber==randomNum.getNumber()){
            System.out.println("恭喜你，猜想十分正确！");
            return false;
        }
        else if(inputNumber>randomNum.getNumber()){
            System.out.println("你输入的数字有点大，要不要再试试？");
            return true;
        }
            else {
                System.out.println("你输入的数字有点小，要不要再试试？");
                return true;
            }
    }

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }
}
