package CreatingObject;

import java.io.FileReader;
//import java.io.FileReader;
import java.util.*;
public class countDown {
	 public static void main(String []a) throws Exception
     {    FileReader f = new FileReader("demo.txt");
         int l,w,ch;
         l=w=ch=0;
         int c;
         while((c=f.read())!=-1)
         {    if(c==' ')
                 w++;
             else if(c=='\n')
             {    l++; w++;
             }
             else
                 ch++;
         }
       System.out.println("Lines: "+l+" Words:"+w+"  Characters:"+ch);
     }
}
