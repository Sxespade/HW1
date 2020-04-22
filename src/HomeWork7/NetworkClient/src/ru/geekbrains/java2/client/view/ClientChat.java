package HomeWork7.NetworkClient.src.ru.geekbrains.java2.client.view;


import HomeWork7.NetworkClient.src.ru.geekbrains.java2.client.controller.ClientController;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

public class ClientChat extends JFrame {

    private JPanel mainPanel;
    private JList<String> usersList;
    private JTextField messageTextField;
    private JButton sendButton;
    private JTextArea chatText;
    private JPanel jPanel1;

    private ClientController controller;

    public ClientChat(ClientController controller) {
        this.controller = controller;
        setTitle(controller.getUsername());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        addListeners();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                controller.shutdown();
            }
        });

        String[] arr = new String[] {"nick1","nick2","nick3"};
        usersList.setListData(arr);
    }


    private void addListeners() {
        sendButton.addActionListener(e -> ClientChat.this.sendMessage());
        messageTextField.addActionListener(e -> sendMessage());
    }

    private void sendMessage() {
        String message = messageTextField.getText().trim();
        if (message.isEmpty()) {
            return;
        }

        appendOwnMessage(message);
        controller.sendMessage(message);
        messageTextField.setText(null);
    }

    public void appendMessage(String message) {
        SwingUtilities.invokeLater(() -> {
            chatText.append(message);
            chatText.append(System.lineSeparator());
        });
    }


    private void appendOwnMessage(String message) {
        appendMessage("Я: " + message);
    }


}
