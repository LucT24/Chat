/**
 * Created by Lucte on 2/13/2017.
 */

import java.lang.*;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket skt = new Socket("127.0.0.1", 1234);
            BufferedReader in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
            System.out.println("Received string: ");

            while (!in.ready()) {
                System.out.println(in.readLine());
            }
            System.out.println("'");
            in.close();
        }
        catch(Exception e) {
            System.out.println("Whoops! It didn't work!");
        }
    }
}
