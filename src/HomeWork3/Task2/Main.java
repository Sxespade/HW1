package HomeWork3.Task2;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Zeml", "+7926");
        phoneBook.add("Zeml", "+7903");
        phoneBook.get("Zeml");
    }
}