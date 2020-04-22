package HomeWork7.NetworkClient.src.ru.geekbrains.java2.client.controller;

@FunctionalInterface
public interface AuthEvent {
    void authIsSuccessful(String nickname);
}
