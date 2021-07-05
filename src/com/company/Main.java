package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String x = "\n123, \"Васильев Евстахий Борисович\"\n151, \"Коновалов Степан Петрович\"\n332, \"Калинин Артём Валериевич\"";
        System.out.println("если хотите ввести новых студентов напишите 1 и введите код и имя студента\nесли хотите увидеть имеющихся студентов напишите 2  ");

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();



                if(i == 2){

                    System.out.println( x );
                }
                if(i == 1){
                    String u = scan.next();

                    System.out.println(u+x);

                }

    }
}