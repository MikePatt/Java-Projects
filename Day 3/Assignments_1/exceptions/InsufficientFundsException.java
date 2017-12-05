package exceptions;

public class InsufficientFundsException extends Exception 
{	
   private double required;
   
   public InsufficientFundsException(double required) 
   {
	  super("This account does not have enough funds for this request\nYou need: $" + required);
      this.required = required;
   }
   
   public double getRequired() 
   {
      return required;
   }
}
