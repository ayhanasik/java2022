package intro;

// 14.9.2022 tarihinde Engin Demiroğ tarafından verilen Java kurs 1. ders

public class Main {

	public static void main(String[] args) {
		System.out.println("Merhaba yakışıklı koçum!");
		String ortaMmetin = "İlginizi çekebilir";
		String altMetin = "Vade Süresi";

		System.out.println(ortaMmetin);
		System.out.println(altMetin);

		int vade = 12;
		double dolarDun = 18.20;
		double dolarBugun = 18.20;

		boolean dolarDustuMu = false;

		String okYonu = "";

		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

		// array
		String[] krediler = { "Hızlı Kredi", "Maaşa Bağlı Kredi", "Sporcu Kredi" };

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
