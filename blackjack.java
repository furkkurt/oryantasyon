import java.util.Scanner;
public class blackjack{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int kart1 = (int)(Math.random() * 11 + 1);
		int kart2 = (int)(Math.random() * 11 + 1);
		int toplam = kart1+kart2;
		boolean kartIste = false;
		int rakip = (int)(16 + Math.random() * 6);
		System.out.println(kart1 + " ve " + kart2 + " / Toplam: " + toplam + " Kart istiyor musun? (true/false)");
		kartIste = input.nextBoolean();
		while(kartIste == true){
			int yeniKart = (int)(Math.random() * 11 + 1);
			toplam = toplam + yeniKart;
			if(toplam>21)
				break;
			System.out.println(yeniKart + " Toplam: " + toplam + ". Yeni kart? (true/false)");
			kartIste = input.nextBoolean();
		}
		if(toplam>21)
			System.out.println("Toplam: " + toplam + " KAYBETTIN!");

		if(rakip>toplam && toplam<21)
			System.out.println("Sen: " + toplam + " Rakip: " + rakip + " KAYBETTİN!");
		else if(rakip<toplam && toplam<21)
			System.out.println("Sen: " + toplam + " Rakip: " + rakip + " KAYBETTİN!");
	}
}
