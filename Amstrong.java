package com.app;

public class Amstrong {

	public static void main(String[] args) {
		int a, c = 0, temp, n = 153;
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);

		}
		if (temp == c)
			System.out.println("am");
		else
			System.out.println("not am");

	}

}
