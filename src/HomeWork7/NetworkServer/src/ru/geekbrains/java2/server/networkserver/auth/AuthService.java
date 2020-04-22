package HomeWork7.NetworkServer.src.ru.geekbrains.java2.server.networkserver.auth;

public interface AuthService {

    String getNickByLoginAndPassword(String login, String password);

    void start();
    void stop();

}
