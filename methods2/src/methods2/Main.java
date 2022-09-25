package methods2;

public class Main {

	public static void main(String[] args) {
		ekle();
		sil();
		System.out.println(topla(3, 15));
		System.out.println(topla(2, 3, 4, 5, 6)); // variable arguments kullanılan metod
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
}
