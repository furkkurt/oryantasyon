import java.util.Scanner;
public class tasKagitMakas{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int rakip = (int)Math.random() * 3;
		System.out.println("Seçim yapın: Taş(0), Kağıt(1), Makas(2)");
		int oyuncu = input.nextInt();
		
		if(oyuncu == 0)
			System.out.print("Taş vs ");
		else if(oyuncu == 1)
			System.out.print("Kağıt vs ");
		else
			System.out.print("Makas vs ");

		if(rakip == 0)
			System.out.print(" Taş: ");
		else if(rakip == 1)
			System.out.print(" Kağıt: ");
		else
			System.out.print(" Makas: ");
	
		if(rakip == oyuncu)
			System.out.println("Berabere");
		else if(oyuncu == 0 && rakip == 1)
			System.out.println("Kaybettin :(");
		else if(oyuncu == 0 && rakip == 2)
			System.out.println("Kazandın :D");
		else if(oyuncu == 1 && rakip == 0)
			System.out.println("Kazandın :D");
		else if(oyuncu == 1 && rakip == 2)
			System.out.println("Kaybettin :(");
		else if(oyuncu == 2 && rakip == 0)
			System.out.println("Kaybettin :(");
		else if(oyuncu == 2 && rakip == 1)
			System.out.println("Kazandın :D");
	}
}
