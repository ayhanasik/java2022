package loop;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// for
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngü Dışı!");

		// while
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngü Dışı!");

		// Do-While
		i = 2;
		do {
			System.out.println(i);
			i += 2;
		} while (i < 10);
		System.out.println("Do-While Döngü Dışı!");
	}
}
