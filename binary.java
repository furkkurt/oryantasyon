import java.util.Scanner;
public class binary{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		String sonuc = "";
		while(s>0){
			sonuc = s%2 + sonuc;
			s = s/2;
		}
		System.out.println(sonuc);
	}
}
