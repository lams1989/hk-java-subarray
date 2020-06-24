package com.luiggy.java;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		int cont = 0;

		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
			int suma = 0;
			for (int j = i; j >= 0; j--) {
				suma += numbers[j];
				if (suma < 0) {
					cont++;
				}
			}

		}
		System.out.println(cont);
		sc.close();
	}
}
