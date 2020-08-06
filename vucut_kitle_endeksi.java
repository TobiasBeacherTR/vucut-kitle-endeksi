package vke;
import java.util.Scanner;
public class vucut_kitle_endeksi {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Lutfen kilonuzu giriniz : ");
		double kg=scanner.nextDouble();
		System.out.print("Lutfen boyunuzu metre cinsinden giriniz Örn(1,90) : ");
		double boy=scanner.nextDouble();
		
		double vke=kg/(Math.pow(boy, 2));
		
		System.out.println("Vucut kitle endeksi : " + vke);
	}

}
