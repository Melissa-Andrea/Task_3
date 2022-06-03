public class StudentDiscount implements IDiscountPolicies{

    @Override
    public double getDiscount(double amount) {
        double discount = (amount * 20)/100;
        return discount;
    }
}
