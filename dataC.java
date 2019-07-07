package Socket;
import java.net.*;
import java.util.Scanner;
import java.io.*;
public class dataC {
	public static void main(String args[])
		{
			try
			{
				DatagramSocket s = new DatagramSocket(2480);
				while(true)
				{
				byte buffer[] = new byte[65535];

				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);

				
				s.receive(dp);
				String msg= new String(dp.getData(), 0, dp.getLength());
				System.out.println(msg);
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the message");
				String msg1 = sc.nextLine();
				byte data[] = msg1.getBytes();
				
				DatagramPacket dp1 = new DatagramPacket(data, 0, data.length, InetAddress.getByName("localhost"), 8528);
				
				s.send(dp1);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}
