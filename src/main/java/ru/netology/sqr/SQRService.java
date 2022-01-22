package ru.netology.sqr;

public class SQRService {
    public int counter(int bottom, int ceil) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bottom && i * i <= ceil) {
                count++;
            }
        }
        return count;
    }
}
