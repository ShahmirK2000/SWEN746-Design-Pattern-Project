/*
 * Shahmir Mahmud Khan
 */
package Strategy;
//This class implements a direct deposit strategy, which basically just prints out a different message when the cart is paid off

public class DirectDepositStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using a direct bank deposit!");
    }
}
