package Socket;
import java.net.*;
import java.nio.Buffer;
import java.util.StringTokenizer;
import java.io.*;
public class mathS implements Runnable{
			Socket s;
				public mathS(Socket s)
				{
					this.s = s;
				}
				public static void main(String args[])throws Exception
				{
					ServerSocket ss = new ServerSocket(2109);
					while(true)
					{
						Socket s = ss.accept();
						mathS m = new mathS(s);
						Thread t = new Thread(m);
						t.start();
					}
				}
				public void run()
				{
					try
					{
					     OutputStream os = s.getOutputStream();
					     BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
					     BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
					     PrintStream ps = new PrintStream(os);
					     while (true)
					     {
					         String input = br.readLine();
					         System.out.println(input);
					         if(input.equals("bye"))
					             break;
					         
					         
					         int result;
					         StringTokenizer st = new StringTokenizer(input);
					         int oprnd1 = Integer.parseInt(st.nextToken());
					         String operation = st.nextToken();
					         int oprnd2 = Integer.parseInt(st.nextToken());
					         if (operation.equals("+"))
					         {
					             result = oprnd1 + oprnd2;
					         }

					         else if (operation.equals("-"))
					         {
					             result = oprnd1 - oprnd2;
					         }
					         else if (operation.equals("*"))
					         {
					             result = oprnd1 * oprnd2;
					         }
					         else
					         {
					             result = oprnd1 / oprnd2;
					         }
//					         ps.println(Integer.toString(result));
					         ps.println(" answer " + result + " corr");
					     }
					}
					catch(Exception e)
					{
						
					}
					
				}
				
			
}
