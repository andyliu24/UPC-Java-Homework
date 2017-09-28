package CheckDanger;

public class Check {
    public static void main(String[] args) {
        Machine machine=new Machine();
        String name[]={"苹果","炸药","西服","硫酸","手表","韩宝坤"};
        Good []goods=new Good[6];
        for (int i=0; i<name.length; i++){
            if (i%2==0){
                goods[i]=new Good(false);
                goods[i].setName(name[i]);
            }
            else {
                goods[i]=new Good(true);
                goods[i].setName(name[i]);
            }
        }
        for (int i=0; i<name.length; i++){
            try{
                machine.checkBag(goods[i]);
                System.out.println(goods[i].getName()+"检查通过！");
            } catch (DangerException e) {
                e.toShow();
                System.out.println(goods[i].getName()+"被干掉了！");
            }
        }
    }
}
