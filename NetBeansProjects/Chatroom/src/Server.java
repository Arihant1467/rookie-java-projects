
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arihant
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(1234);
        System.out.println("New Message");
        Socket s=ss.accept();
        InputStream is=s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        String receiveddata=dis.readUTF();
        dis.close();
        
    }
    
}
