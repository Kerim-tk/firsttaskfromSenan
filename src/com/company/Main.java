package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String x = "\n123, \"Евстахий \"\n151, \" Степан \"\n332, \" Артём \"";
        System.out.println("если хотите ввести новых студентов напишите 1 и введите код и имя студента\nесли хотите увидеть имеющихся студентов напишите 2  ");

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();



                if(i == 2){

                    System.out.println( x );
                }
                if(i == 1){

                    int p = scan.nextInt();
                    String u = scan.nextLine();

                    System.out.println(p +u+x);

                }

    }
}