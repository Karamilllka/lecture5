package ru.netology.sqr;

public class SQRService {
    public int squaresCalculator(int bottomBound, int upperBound) {
        int counter = 0;
        int num;
        for (int i = 10; i < 100; i++) {
            num = i * i;
            if ((num >= bottomBound) && (num <= upperBound)) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
