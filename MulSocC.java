package Socket;

import java.net.*;
import java.io.*;

public class MulSocC {
 
   
    PrintStream ps=null;
    
	public static void main(String[] args) {
          try {
        	  Socket s=new Socket("localhost",7778);        	 
         	  OutputStream os=s.getOutputStream(); 
        	  PrintStream ps=new PrintStream(os);
        	  BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));;
        	  BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
        	  
	        	 while(true)
	        	 {
	        		 System.out.println("enter message");
	           	  String st=kb.readLine();
	           	   ps.println(st);
	           	   
	           	   String s1=br.readLine();
	           	   System.out.println(s1);
	        	 }
        	   
        	     	   
        	   }
          catch(Exception e) {
        	  
          }
       
          
	}

}