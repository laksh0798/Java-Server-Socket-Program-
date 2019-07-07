package Socket;	
import java.io.*;
import java.net.*;
public class pong {
		public static void main(String args[])
		{
			try
			{
					ServerSocket ss = new ServerSocket(4561);
					Socket s = ss.accept();
					OutputStream os = s.getOutputStream();
					BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
					while(true)
					{
					PrintStream ps = new PrintStream(os);
					String st = br.readLine();
					if(st.equals("ping"))
					{
						ps.println("pong");
					}
					else
					{
						ps.println("Enter message is incorrect");
					}
//					ss.close();
//					s.close();
//					ps.close();
//					br.close();
//					os.close();
					}
			}
			catch(Exception e)
			{
				
			}
		}
}
