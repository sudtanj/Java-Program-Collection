import java.io.File;
import java.util.Scanner;
public class TicketNumber {
	public static void main (String[] args) {
		int input= new Scanner(System.in).nextInt();
		if(((int)input/10)%7==(input%10)) System.out.print(input+"; the comparison should evaluate to true"); else System.out.print(input+"; the comparison should evaluate to false");
	}
}