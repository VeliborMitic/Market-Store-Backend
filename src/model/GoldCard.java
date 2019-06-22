package model;

public class GoldCard extends Card implements Discountable {

    public GoldCard(Owner owner, double lastMonthTurnover) {
        super(owner, lastMonthTurnover);
        this.setDiscountRate(2);
    }

    @Override
    public double calculateDiscountRate() {
        double discountRate = (int)(this.getDiscountRate() + this.getLastMonthTurnover() / 100);

        return  (discountRate > 10) ? 10 : discountRate;
    }
}