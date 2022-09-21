package arrays;

public class Main {

	public static void main(String[] args) {
		//
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Ayhan";
		ogrenciler[1] = "Betül";
		ogrenciler[2] = "Elif";
		ogrenciler[3] = "Ali";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("---------------");
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
