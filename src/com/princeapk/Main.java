package com.princeapk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Code to Calculate Volume of a Rectangular Prism

        double volume, length, width, height;


        Scanner sc = new Scanner (System.in);


        System.out.println("Enter Length: ");
        length = sc.nextDouble();

        System.out.println("Enter Width: ");
        width = sc.nextDouble();

        System.out.println("Enter Height: ");
        height = sc.nextDouble();

        volume = length * width * height;
        System.out.println("Volume: " + volume);

        sc.close();
    }
}
