package model;

public class SilverCard extends Card implements Discountable {

    public SilverCard(Owner owner, double lastMonthTurnover) {
        super(owner, lastMonthTurnover);
        this.setDiscountRate(2);
    }

    @Override
    public double calculateDiscountRate() {

        return (this.getLastMonthTurnover() > 300) ? 3.5 : this.getDiscountRate();
    }
}