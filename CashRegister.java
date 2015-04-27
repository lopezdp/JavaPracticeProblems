/**
 * David P. Lopez
 * COP2800 HW E8.3
 * Bank Account Application
 */
package POS;

/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double purchase;
   private double payment;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
   }
   
   /**
      Enters the payment received from the customer.
      @param paymentReceived is the total amount received
      * in Dollars & Cents
   */
   public void receivePayment(double paymentReceived)
   {
      payment = payment + paymentReceived;
   }
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }
}

