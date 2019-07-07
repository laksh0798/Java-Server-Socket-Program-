package Socket;
import java.net.*;
import java.io.*;
public class ping {
		public static void main(String args[])
		{
			try
			{
				Socket s= new Socket("127.0.0.1", 4561);
				OutputStream os = s.getOutputStream();
				PrintStream ps = new PrintStream(os);
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				BufferedReader kb = new BufferedReader( new InputStreamReader(System.in));
				while(true) {
				System.out.println("Enter the message");
				String data = kb.readLine();
				ps.println(data);
				
				String msg = br.readLine();
				System.out.println(msg);
//				s.close();
//				ps.close();
//				br.close();
//				kb.close();
//				os.close();
				}
			}
			catch(Exception e)
			{
				
			}
		}
}
