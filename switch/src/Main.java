
public class Main {

	public static void main(String[] args) {
		// switch
		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Kötü  : Kaldınız");
			break;
		default:
			System.out.println("Geçersiz Not Girdiniz!");
		}
	}

}
