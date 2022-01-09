import java.util.Scanner;
public class faktoriyel{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz;");
		int sayi = input.nextInt();
		int sonuc = 1;

		while(sayi>1){
			sonuc = sonuc*sayi;
			sayi = sayi - 1;
		}

		System.out.println(sonuc);
	}
}
