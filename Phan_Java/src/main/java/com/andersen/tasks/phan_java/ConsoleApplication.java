package com.andersen.tasks.phan_java;

import java.util.Scanner;

public class ConsoleApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean isRunning = true;
        while(isRunning)
        {
            showMenu();
            try{
                option = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("There is no such option");
                continue;
            }
            switch (option) {
                case 1:
                    System.out.println("Enter number");
                    System.out.println(InputDataValidation.checkNumber(scanner.nextLine()));
                    break;
                case 2:
                    System.out.println("Enter name");
                    System.out.println(InputDataValidation.checkName(scanner.nextLine()));
                    break;
                case 3:
                    System.out.println("Enter Array");
                    System.out.println(InputDataValidation.parseArray(scanner.nextLine().trim().split(" ")));
                    break;
                case 4 :
                    isRunning = false;
                    break;
                default :
                    System.out.println("There is no such option");
                    break;
            }
        }
    }



    public static void showMenu() {
        System.out.println("1 - Enter number\n2 - Enter name\n3 - Enter numeric array\n4 - exit");
    }
}
