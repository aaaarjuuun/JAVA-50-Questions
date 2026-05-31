import java.net.*;
import java.io.*;

public class SERVER21 {
    public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Server is waiting for clint...");


            Socket s = ss.accept();
            System.out.println("Clint Connected!");

            DataInputStream dis = new DataInputStream(s.getInputStream());

            String str = (String) dis.readUTF();
            System.out.println("Message from Clint: " + str);

            ss.close();

        }catch(Exception exceptione){
            System.out.println("Server Error: " + exceptione.getMessage());
        }
    }
}
