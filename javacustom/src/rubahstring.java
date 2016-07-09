import java.io.File;
import java.util.Scanner;
class rubahstring {
	public static void main (String[] args){
		String pecah=String(char[] value);
		pecah=new Scanner(System.in).nextLine();
		//String[] pecah=new Scanner(System.in).nextLine().toUpperCase().split("");
		String hasil="";
		for (int i=0;i<pecah.length; i++){
			if (i>0 && i<pecah.length) hasil+=".";
			hasil+=pecah[i];
		}
		System.out.println((int)pecah);
	}
}