package org.example;

import java.security.cert.TrustAnchor;

public class Main {

    public static int FirstNumber(int x) {
        return x / 100;
    }

    public static int SecondNumber(int x) {
        return (x % 100)/ 10;
    }

    public static int ThirdNumber(int x) {
        return x%10;
    }

    public static int Checker(int first, int second, int third) {
        if ((Math.abs(first-second) >= 3) && (Math.abs(second-third) >= 3) && (Math.abs(first-third) >= 3)) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 100; i < 999; i++) {
            answer += Checker(FirstNumber(i), SecondNumber(i), ThirdNumber(i));
        }
        System.out.println(answer);
    }
}