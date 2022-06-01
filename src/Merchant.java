public class Merchant implements Seller {

    @Override
    public String sell(Merchant.Goods goods) {
        String result = "";
        if(goods == Goods.POINT) {
            result = "potion";
        }
        return result;
    }
    public enum Goods {
        POINT
    }
}
