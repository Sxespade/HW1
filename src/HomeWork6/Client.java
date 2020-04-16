package HomeWork6;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static final int CONNECTION_TIMEOUT = 10_000;

    public static void main(String[] args) {
        Socket socket = new Socket();

        try {
            socket.connect(new InetSocketAddress("localhost", Server.SERVER_PORT), CONNECTION_TIMEOUT);
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            new Thread(() -> {
                try {
                    while (true) {
                        String messageFromServer = inputStream.readUTF();
                        System.out.println("Server: " + messageFromServer);
                    }
                } catch (IOException e) {
                    System.err.println("Соединение с сервером было закрыто!");
                    e.printStackTrace();
                }
            }).start();

            try {
                while (true) {
                    Scanner scanner = new Scanner(System.in);
                    String s = scanner.nextLine();
                    outputStream.writeUTF(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}