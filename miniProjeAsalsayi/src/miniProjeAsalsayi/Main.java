package miniProjeAsalsayi;

public class Main {

	public static void main(String[] args) {
		int number = -1;
		// int remainder = number % 2;

		if (number == 1) {
			System.out.println("Sayı ASAL değil");
			return;
		}
		if (number < 1) {
			System.out.println("Geçersiz Sayı!");
			return;
		}
		boolean isPrime = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Sayı ASAL");
		} else {
			System.out.println("Sayı ASAL değil");
		}
	}

}
