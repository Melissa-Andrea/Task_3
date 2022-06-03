public class BookStore {
    private IDiscountPolicies discount;

    public BookStore(IDiscountPolicies discount) {
        this.discount = discount;
    }

    public void setDiscount(IDiscountPolicies discount){
        this.discount = discount;
    }

    public void sellBook(String bookName, double itemPrice){
        double discount = this.discount.getDiscount(itemPrice);
        double new_amount = itemPrice - discount;
        System.out.println( "Book name:" + " " + bookName + "  " + "New amount:" + " " + new_amount);

    }
}
