package Encapsulation1;

public class MainClass {
	
	 public static void main(String[ ] args)
     {    int amt=0;
           Check obj= new Check();
              obj.setAmount(200);
              amt=obj.getAmount();
              System.out.println ("Your current amount is :"+amt);
      }

}
