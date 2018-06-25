
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("Message to client");
            String datatosent=new Scanner(System.in).nextLine();
            Socket s=new Socket("192.168.1.66",1234);
            OutputStream os=s.getOutputStream();
            DataOutputStream dos=new DataOutputStream(os);
            dos.writeUTF(datatosent);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
