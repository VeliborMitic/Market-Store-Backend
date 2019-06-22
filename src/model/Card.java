package model;

public abstract class Card implements Discountable {

    private Owner owner;
    private double lastMonthTurnover;
    private double discountRate;

    protected Card(Owner owner, double lastMonthTurnover) {
        this.owner = owner;
        this.lastMonthTurnover = lastMonthTurnover;
        owner.addCard(this);
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public double getLastMonthTurnover() {
        return lastMonthTurnover;
    }

    public void setLastMonthTurnover(double lastMonthTurnover) {
        this.lastMonthTurnover = lastMonthTurnover;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}