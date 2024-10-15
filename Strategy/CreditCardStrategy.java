/*
 * Shahmir Mahmud Khan
 */
package Strategy;
//This class implements a credit card strategy, which basically just prints out a different message when the cart is paid off
public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using a Credit Card!");
    }
}
