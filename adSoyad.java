import java.util.Scanner;
public class adSoyad{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Ad ve soyad giriniz;");
		String adSoyad = input.nextLine();

		int bosluk = adSoyad.lastIndexOf(" ");
		String ad = adSoyad.substring(0, bosluk);
		String soyad = adSoyad.substring(bosluk);

		System.out.println("Ad: " + ad + " / Soyad:" + soyad);
	}
}
