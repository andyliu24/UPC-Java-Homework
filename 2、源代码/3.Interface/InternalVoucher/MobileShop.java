package InternalVoucher;

public class MobileShop {
    public int getMobileAmount() {
        System.out.println("手机专卖店目前还有"+mobileAmount+"部手机。");
        return mobileAmount;
    }

    private int mobileAmount;

    public InnerPurchaseMoney worth20000;
    public InnerPurchaseMoney worth10000;

    MobileShop(int mobileAmount){
        this.mobileAmount=mobileAmount;
        System.out.println("手机专卖店有"+mobileAmount+"部手机。");
        worth20000=new InnerPurchaseMoney(20000);
        worth10000=new InnerPurchaseMoney(10000);
    }

    public void buyMobile(InnerPurchaseMoney innerPurchaseMoney){
        int number;
        number=((innerPurchaseMoney.worth)/10000)*3;
        if (mobileAmount>=number){
            mobileAmount-=number;
            System.out.println("用价值"+innerPurchaseMoney.worth+"的内部优惠券购买了"+number+"部手机。");
        }
        else{
            System.out.println("库存不足，购买失败。");
        }
    }

    class InnerPurchaseMoney{
        protected int worth;
        InnerPurchaseMoney(int worth){
            this.worth=worth;
        }
    }

}
