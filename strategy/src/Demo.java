public class Demo {
    public static void main(String[] args) {
        IDiscountPolicies studentDiscount = new StudentDiscount();
        IDiscountPolicies blackFridayDiscount = new BlackFridayDiscount();

        BookStore bookStore = new BookStore(studentDiscount);
        bookStore.sellBook("Corazon", 200);

        bookStore.setDiscount(blackFridayDiscount);
        bookStore.sellBook("Abril", 300);

    }
}
