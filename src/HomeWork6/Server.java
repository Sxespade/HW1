package HomeWork6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static final int SERVER_PORT = 8189;

    public static void main(String[] args) {
        System.out.println("Старт эхо-сервера");
        try {
            ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
            System.out.println("Сервер запущен, ожидаем подключения...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Клиент подключился!");

            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());


            new Thread(() -> {
                try {
                    while (true) {
                        String messageFromServer = inputStream.readUTF();
                        System.out.println("Client: " + messageFromServer);
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

            serverSocket.close();

        } catch (IOException e) {
            System.err.println("Port " + SERVER_PORT + " is already used!");
            e.printStackTrace();
        }
    }
}