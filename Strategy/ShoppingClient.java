/*
 * Shahmir Mahmud Khan
 */
package Strategy;

public class ShoppingClient {
    public static void main(String[] args) {
        Cart cart = new Cart();

        //Attempting to pay with no strategy selected, should produce an error message
        cart.addToCart("Hoodie", 49.99);
        cart.addToCart("Jeans", 29.99);
        System.out.println(cart);
        cart.checkout();

        //Attempting to pay with the credit card strategy
        cart.setPaymentStrategy(new CreditCardStrategy());
        cart.checkout();

        //Attempting to pay with the direct deposit strategy
        cart.addToCart("Poster", 3.85);
        cart.addToCart("Shoes", 65.55);
        System.out.println(cart);
        cart.setPaymentStrategy(new DirectDepositStrategy());
        cart.checkout();

        //Attempting to pay with the Paypal strategy
        cart.addToCart("Laptop", 1599.99);
        cart.addToCart("Airpods", 249.99);
        System.out.println(cart);
        cart.setPaymentStrategy(new PaypalStrategy());
        cart.checkout();
    }
}
