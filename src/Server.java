/**
 * Created by Lucte on 2/13/2017.
 */

import java.lang.*;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        String data = "Toobie ornaught toobie";
        try {
            ServerSocket srvr = new ServerSocket(1234);
            Socket skt = srvr.accept();
            System.out.println("Server has connected!");
            PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
            System.out.println("Sending string: '" + data + "'");
            out.print(data);
            out.close();
            skt.close();
            srvr.close();
        }
        catch(Exception e) {
            System.out.println("Whoops! It didn't work!");
        }
    }
}
