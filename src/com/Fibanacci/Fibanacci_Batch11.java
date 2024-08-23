package com.Fibanacci;

public class Fibanacci_Batch11 {
	public static void main(String[] args) {
		int a = 0, b = 1, c;
		int n = 50;
		for (int i = 1; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
			if (c > 100) {
				break;
			}
			System.out.println(c);

		}

	}

}
