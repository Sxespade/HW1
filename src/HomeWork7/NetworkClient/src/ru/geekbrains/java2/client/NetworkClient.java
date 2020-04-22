package HomeWork7.NetworkClient.src.ru.geekbrains.java2.client;



import HomeWork7.NetworkClient.src.ru.geekbrains.java2.client.controller.ClientController;

import javax.swing.*;
import java.io.IOException;

public class NetworkClient {

    public static void main(String[] args) {
        try {
            ClientController clientController = new ClientController("localhost", 8189);
            clientController.runApplication();
        } catch (IOException e) {
            System.err.println("Failed to connect to server! Please, check you network settings");
            e.printStackTrace();
        }
    }
}
