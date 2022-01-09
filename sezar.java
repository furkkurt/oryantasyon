import java.util.Scanner;
public class sezar{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz;");
		int s = input.nextInt();
		System.out.println("Mesajı giriniz;");
		String mesaj = input.next();
		String alfabe = "abcdefgğhıijklmnoöprsştuüvyz";
		
		for(int i=0; i<mesaj.length(); i++){
			char harf = mesaj.charAt(i);
			int harfSırası = alfabe.indexOf(harf);
			int yeniHarfSırası = harfSırası + s;
			if(yeniHarfSırası>alfabe.length())
				yeniHarfSırası = yeniHarfSırası - alfabe.length();
			char yeniHarf = alfabe.charAt(yeniHarfSırası);
			System.out.print(yeniHarf);
		}
	}
}
