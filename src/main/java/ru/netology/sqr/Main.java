package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int counter = service.counter(300, 500);
        System.out.println(counter++);

    }
}