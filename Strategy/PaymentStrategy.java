/*
 * Shahmir Mahmud Khan
 */
package Strategy;
//This is the interface of the strategy, and since it is not implemented it will need
//child classes that handle the different payment methods separately
public interface PaymentStrategy {
    public abstract void pay(double amount);
}
