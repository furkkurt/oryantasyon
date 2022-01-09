import java.util.Scanner;
public class kokHesaplama{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("ax^2 + bx + c için a, b ve c değerlerini sırasıyla giriniz;");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		double x1 = (-b + Math.sqrt(Math.abs(Math.pow(b,2) - (4*a*c)))) / 2*a;
		double x2 = (-b - Math.sqrt(Math.abs(Math.pow(b,2) - (4*a*c)))) / 2*a;

		System.out.println(a + "x^2 " + b + "x " + c + "denkleminin kökleri: " + x1 + " " + x2);
	}
}
