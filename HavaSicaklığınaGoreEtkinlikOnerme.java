package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int heat;

        Scanner scanner =new Scanner(System.in);

        System.out.println("L�tfen Hava S�cakl���n� Giriniz : ");
        heat =scanner.nextInt();

        if(heat>25){
            System.out.print("Y�zmeye gidebilirsin.");
        }else if(heat >=15){
            System.out.print("Pikni�e gidebilirsin.");
        }else if(heat>=10 ){
            System.out.print("Pikni�e gidebilirsin.");
            System.out.print("Sinemaya gidebilirsin.");
        }else if (heat>=5){
            System.out.print("Sinemaya gidebilirsin.");
        }else{
            System.out.print("Kayak yapmaya gidebilirsin.");
        }


    }
}