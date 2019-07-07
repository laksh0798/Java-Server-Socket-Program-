package Socket;
import java.net.*;
import java.io.*;
public class MulSocS implements Runnable
		{
				Socket s;
				 MulSocS(Socket s)
				{
					this.s = s;
				}
				public static void main(String[] args)throws IOException
				{
					
					ServerSocket ss= new ServerSocket(7778); 
						while(true)
						{
							
							Socket s = ss.accept();
							MulSocS m = new MulSocS(s);
							Thread t = new Thread(m);
							t.start();
						}
				}		
						public void run()
						{
							try
							{
								OutputStream os=s.getOutputStream(); 
					      	    PrintStream ps=new PrintStream(os);
					      	    BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
					      	    String st=br.readLine(); 
					      	    ps.println(st);
					      	   
					      	    os.close();
					      	    ps.close();
					      	    br.close();
							}
							catch(Exception e)
							{
								
							}
						}
		}			
