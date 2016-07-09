import java.io.File;
import java.util.Scanner;
public class Initials {
	public static void main(String[] args){
		char[] input={'J','F','M'};
		for (int i=0;i<input.length; i++){
			if (i>0) System.out.print(".");
			System.out.print(input[i]);
		}
	}
}