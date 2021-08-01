package com.greatLearning.training.prework;

import java.util.Scanner;

public class Prework {
	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {
		System.out.println("Enter the number to check for the palindrome:");
		int num = sc.nextInt();
		int temp, sum = 0, r;
		temp = num;
		while (num != 0) {
			r = num % 10;
			sum = sum * 10 + r;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("The number " + temp + " is palindrome");
		} else {
			System.out.println("The number " + temp + " is not a palindrome");
		}
		System.out.println();

	}

	// function to printPattern

	public void printPattern() {
		System.out.println("Enter the number to print the pattern:");
		int num = sc.nextInt();
		for (int i = num; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// function to check no is prime or not

	public void checkPrimeNumber() {
		System.out.println("Enter the number to check whether it's prime or not prime");
		int num = sc.nextInt();
		int m=0, flag=0;
		m = num / 2;
		if (num == 0 || num == 1) {
			System.out.println("Number " + num + " is not a prime number");
		} else {
			for (int i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime number");
					flag = 1;
					break;
				} else {
					
				}
			}
			if(flag == 0) {
				System.out.println(num + " is a prime number");
			}

		}
		System.out.println();
	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.
		System.out.println("Enter the number for the fibinacci series: ");
		int num = sc.nextInt();
		int first = 0, second = 1;
		int fib;
		System.out.print(first + " " + second);
		for (int i = 0; i < num - 1; i++) {
			fib = first + second;
			first = second;
			second = fib;
			System.out.print(" " + fib);
		}
		System.out.println();

	}

	public static void main(String[] args) {

		Prework ob = new Prework();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				ob.checkPalindrome();

			}

				break;

			case 2: {

				ob.printPattern();

			}

				break;

			case 3: {

				ob.checkPrimeNumber();

			}

				break;

			case 4: {

				ob.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}
