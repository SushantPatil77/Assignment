package GreaterAndSmallerNo;

public class GreaterAndSmallerNo {

	public static void main(String[] args) 
	{
       int a[]= {3,6,3,7,88,2,56,36,89};
       
       int GreaterNo=Integer.MIN_VALUE;
       int SmallererNo=Integer.MAX_VALUE;
       
       for (int i =0; i < a.length; i++)
       {
		  if(GreaterNo<a[i])
			  GreaterNo=a[i];
		  else if(SmallererNo>a[i])
			    SmallererNo=a[i];
			  
	   }
       System.out.println("GreaterNo ="+GreaterNo);
       System.out.println("Smaller ="+SmallererNo);
       
	}

}
