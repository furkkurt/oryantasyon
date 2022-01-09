import java.util.Scanner;
public class sifre{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Şifre giriniz;");
		String sifre = input.nextLine();

		while(sifre.indexOf(" ") != -1){
			System.out.println("Boşluk kullanamazsınız. Tekrar deneyin;");
			sifre = input.nextLine();
		}
		
		String turkce = "ğüöçşıİ";
		boolean turkceKarakterIcermek = false;
		for(int i=0; i<turkce.length(); i++){
			char turkceKarakter = turkce.charAt(i);
			if(sifre.indexOf(turkceKarakter) != -1)
				turkceKarakterIcermek = true;
		}
		while(turkceKarakterIcermek == true){
			System.out.println("Türkçe karakter kullanamazsınız. Tekrar deneyin;");
			sifre = input.nextLine();
			for(int i=0; i<turkce.length(); i++){
				char turkceKarakter = turkce.charAt(i);
				if(sifre.indexOf(turkceKarakter) != -1)
					turkceKarakterIcermek = true;
				else
					turkceKarakterIcermek = false;
			}
		}
	}		
}
