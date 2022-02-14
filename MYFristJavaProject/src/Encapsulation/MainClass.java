package Encapsulation;

public class MainClass {

	public static void main(String[] args) {
		
		Check s=new Check();
		s.setAmount(12);
		int amount1=s.getAmount();
		System.out.println("the value of amount= "+amount1);
       //print the amount 12
	}

}
