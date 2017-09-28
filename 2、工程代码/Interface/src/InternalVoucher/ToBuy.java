package InternalVoucher;

public class ToBuy {
    public static void main(String[] args) {
        MobileShop mobileShop=new MobileShop(30);
        mobileShop.buyMobile(mobileShop.worth20000);
        mobileShop.buyMobile(mobileShop.worth10000);
        mobileShop.getMobileAmount();
    }
}
