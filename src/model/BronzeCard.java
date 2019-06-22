package model;

public class BronzeCard extends Card{

    public BronzeCard(Owner owner, double lastMonthTurnover) {
        super(owner, lastMonthTurnover);
        this.setDiscountRate(0);
    }

    @Override
    public double calculateDiscountRate() {

        if (this.getLastMonthTurnover() > 100 && this.getLastMonthTurnover() <= 300)
            return 1;
        if (this.getLastMonthTurnover() > 300)
            return 2.5;

        return this.getDiscountRate();
    }
}