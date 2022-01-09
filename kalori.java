import java.util.Scanner;
public class kalori{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Cinsiyetinizi giriniz (erkek için 1 kadın için 2)");
		int cinsiyet = input.nextInt();
		System.out.println("Adım sayısını giriniz; ");
		int adimSayisi = input.nextInt();
		int adimUzunlugu;
		if(cinsiyet == 1)
			adimUzunlugu = 45;
		else
			adimUzunlugu = 30;

		System.out.println((adimUzunlugu * adimSayisi)/500);
	}
}
