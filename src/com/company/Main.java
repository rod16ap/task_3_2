package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int answer = random.nextInt(words.length);
        System.out.println(words[answer]);
        System.out.println("Отгадайте слово из списка");
        System.out.println(Arrays.toString(words));
        Scanner scanner = new Scanner(System.in);
        String useranswer = scanner.nextLine();



    }
}
