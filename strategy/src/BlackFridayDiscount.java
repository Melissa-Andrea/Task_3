public class BlackFridayDiscount implements IDiscountPolicies{

    @Override
    public double getDiscount(double amount) {
        double discount = (amount * 50)/100;
        return discount;
    }
}
