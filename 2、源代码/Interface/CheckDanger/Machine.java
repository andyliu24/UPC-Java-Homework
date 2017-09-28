package CheckDanger;

public class Machine {
    public void checkBag(Good good) throws DangerException{     //通过throws关键字声明要产生的异常，
        if (good.isDanger()) {
            DangerException dangerException = new DangerException();
            throw dangerException;      //抛出该异常对象，停止执行当前方法。
        }
        else {
            System.out.println(good.getName()+"不是危险品！");
        }
    }
}
