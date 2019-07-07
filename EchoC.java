package Socket;

import java.net.*;
import java.io.*;

public class EchoC {
 
   
    PrintStream ps=null;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
        	  Socket s=new Socket("localhost",7778);        	 
         	  OutputStream os=s.getOutputStream(); 
        	  PrintStream ps=new PrintStream(os);
        	  BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));;
        	  BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
        	  
        	  System.out.println("enter message");
        	  String st=kb.readLine();
        	   ps.println(st);
        	   
        	   String s1=br.readLine();
        	   System.out.println(s1);
        	   
        	   s.close();
        	   os.close();
        	   ps.close();
        	   br.close();
        	   kb.close();      	   
        	   }
          catch(Exception e) {}
          
	}

}