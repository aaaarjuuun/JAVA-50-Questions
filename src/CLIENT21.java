import java.net.*;
import java.io.*;
public class CLIENT21 {
    public static void main(String[] args){
        try{
            Socket s = new Socket("localhost",6666);

            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            dout.writeUTF("Hello Server ");

            dout.flush();

            dout.close();
            s.close();
        }catch(Exception exception){
            System.out.println("Client Error: " + exception.getMessage());
        }
    }
}
