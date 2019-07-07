package Socket;

import java.net.*;
import java.io.*;
public class Echos{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Socket s=null;
		try{
			ServerSocket ss=new ServerSocket(1029); 
		    s=ss.accept();
		    OutputStream os=s.getOutputStream(); 
      	    PrintStream ps=new PrintStream(os);
      	    BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
      	    String st=br.readLine(); 
      	    
      	    ps.println(st);
      	    
      	    ss.close();
      	    s.close();
   	        os.close();
   	        ps.close();
   	        br.close();   	
	       }
		catch(Exception e) {}
	}

}