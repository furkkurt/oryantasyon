import java.util.Scanner;
public class asal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz;");
		int s = input.nextInt();
		int i = 2;
		boolean sonuc = true;
		while(i<s){
			if(s%i==0){
				sonuc = false;
				break;
			}
			else
				i++;
		}
		System.out.println(sonuc);
	}
}
