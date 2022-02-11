package Constructor;

public class condemo {
	
	 int x,y,z;
     condemo()
     {
    	 x=y=z=1;
     }   // default constructor
     
     condemo(int a)
     {
    	 x=y=z=a;
     }     // parameterized constructor
     condemo(int p,int q,int r)
     { 
    	 x=p; y=q; z=r; 
     }   // param. Constructor
     condemo(condemo p)
     {
    	 x = p.x; y=p.y;  z=p.z; 
     } //copy constructor
     void sum()
     {  
    	 System.out.println("sum of the values:"+ (x+y+z));
     }

}
