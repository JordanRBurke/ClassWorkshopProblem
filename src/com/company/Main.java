package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);

        Cat cat1 = new Cat();
        userInput.nextLine();

        cat1.setCatAge(userInput.nextLine());
        System.out.println(userInput * 7);


    }
}
