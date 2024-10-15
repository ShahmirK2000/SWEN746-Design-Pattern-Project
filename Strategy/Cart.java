/*
 * Shahmir Mahmud Khan
 */
package Strategy;

import java.util.ArrayList;
//This class is the context of the strategy, and will call the different pay() functions based on which payment type the user wants
public class Cart {
    //Simple private variables to keep track of the strategy, amount due, and items in the cart
    private PaymentStrategy pStrategy;
    private double amountDue;
    private ArrayList<String> items = new ArrayList<String>();

    //Setting which payment option the user wants
    public void setPaymentStrategy(PaymentStrategy pStrategy) {
        this.pStrategy = pStrategy;
    }

    //Adding items to the cart, with an arraylist of strings
    public void addToCart(String name, double price) {
        if(price < 0) {
            System.out.println("Invalid price, shopping cart has not been updated.");
        } else {
            amountDue += price;
            items.add(name);
            System.out.println(name + " has been added to your cart.");
        }
    }

    public double getAmountDue() {
        return amountDue;
    }

    //This will call whichever of the strategies the user has chosen, if no strategy is selected it will print out an error message
    public void checkout() {
        if(pStrategy == null) {
            System.out.println("No payment option selected.");
        } else {
            pStrategy.pay(this.amountDue);
            items.clear();
        }
    }

    //Simple toString method that goes through the items in the array list, formats them, and returns a string with the amount owed
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("The items in your cart are: ");
        for(int i = 0; i < items.size(); i++) {
            sb.append(items.get(i));

            if (i < items.size() - 1) {
                sb.append(", "); //this will add a ", " after all of the items except for the last one in the arraylist
            }
        }
        sb.append(". The total price of the cart is: " + amountDue);
        return sb.toString();        
    }
}
