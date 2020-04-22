package HomeWork7.NetworkServer.src.ru.geekbrains.java2.server;


import HomeWork7.NetworkServer.src.ru.geekbrains.java2.server.networkserver.MyServer;

public class ServerApp {

    private static final int PORT = 8189;

    public static void main(String[] args) {
        MyServer server = new MyServer(8189);
        server.start();
    }
}
