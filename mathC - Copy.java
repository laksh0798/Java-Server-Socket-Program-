package Socket;
import java.io.*;
import java.net.*;
import java.net.*;
import java.util.StringTokenizer;
public class mathC {
	public static void main(String[] args)throws Exception {
		Socket s = new Socket("127.0.0.1", 2109);
        OutputStream os = s.getOutputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(os);
 
        while (true)
        {
            System.out.print("Enter the equation in the form: ");
            System.out.println("'operand operator operand'");
 
            String inp = kb.readLine();
 
            if (inp.equals("bye"))
                break;
 
            ps.println(inp);
 
            String ans = br.readLine();
            System.out.println("Answer=" + ans);
        }
	}
}