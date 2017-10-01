import java.util.Random;

public class RandomNum {

    private int number;
    private int upperLimit;
    private int lowerLimit;

    RandomNum(){                        //空构造函数默认生成0-100的随机数。
        lowerLimit=0;
        upperLimit=100;
        number=(int)(Math.random()*100);
    }

    RandomNum(int lower, int upper){    //传参构造函数生成下限到上限之间的随机数。
        lowerLimit=lower;
        upperLimit=upper;
        int delta;
        delta=(int)((upper-lower)*(Math.random()));
        number=lower+delta;
    }

    public int getNumber() {
        return number;
    }
}
