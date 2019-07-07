package Socket;
import java.net.*;
import java.util.Scanner;
import java.io.*;
public class dataS {
	
	public static void main(String args[])
			{
				try
				{	
					DatagramSocket	s = new DatagramSocket(8528);
					while(true)
					{
					System.out.println("Enter the message: ");
					Scanner sc= new Scanner(System.in);
					String msg = sc.nextLine();
					byte data[] = msg.getBytes();
					DatagramPacket	dp = new DatagramPacket(data, data.length, InetAddress.getByName("localhost"), 2480);
					
					s.send(dp);
					
					byte buffer[] = new byte[65535];
					
					DatagramPacket dp1 = new DatagramPacket(buffer, buffer.length);
				
					s.receive(dp1);
					String msg1= new String(dp1.getData(), 0, dp1.getLength());
				 
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
}
