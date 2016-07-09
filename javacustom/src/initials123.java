import java.io.File;
import java.util.Scanner;
public class Initials {
	public static void main(String[] args){
		String[] hasil=new Scanner(System.in).nextLine().split(" ");
		for (int i=0;i<hasil.length; i++){
			i>0 ? System.out.print(".") : ;
			System.out.print(hasil[i].charAt(0));
		}
	}
}