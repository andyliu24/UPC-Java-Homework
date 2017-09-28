import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        RandomNum randomNum;

        /**
         * 根据输入判断是否设置上下限并生成特定的随机数。
         */

        System.out.println("你是否需要设置随机数的上下限？(Y/N)");
        String choice = reader.next();
        if (choice.equals("Y")||choice.equals("y")){
            int lowerLimit=reader.nextInt();
            int upperLimit=reader.nextInt();
            randomNum=new RandomNum(lowerLimit,upperLimit);
            System.out.println(randomNum.getNumber());
        }
        else {
            randomNum=new RandomNum();
            System.out.println(randomNum.getNumber());
        }

        /**
         * 判断程序，判断输入与预设值是否一致。
         */

        System.out.println("请输入一个随机数：");
        Judge judge=new Judge(reader.nextInt(),randomNum);
        while (judge.toJudge()) {
            System.out.println("请再次输入一个随机数：");
            judge.setInputNumber(reader.nextInt());
        }

    }
}
