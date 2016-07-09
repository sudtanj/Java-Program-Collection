import java.util.Scanner;
import java.util.Random;
public class main{
	public static void main(String[] args){
		System.out.print("\033[H\033[2J");
		Columnsort array;
		System.out.print("Please input the column :");
		int n=new Scanner(System.in).nextInt();
		array=new Columnsort(n);
		for (int y=0;y<n;y++){
			for (int i=0;i<5;i++){
				array.setArray(new Random().nextInt(20),y,i);
			}
		}
		for (int i=0;i<(int)n/2;i++)
			System.out.print("    ");
		System.out.println("Array Before Sorted");
		for (int i=0;i<(int)n/2;i++)
			System.out.print("    ");
		System.out.println("-------------------");
		for (int y=0;y<5;y++){
			for (int i=0;i<n;i++)
				System.out.print("+====+ ");
			System.out.println();
			for (int i=0;i<n;i++){
				if (array.readArray(n)[i][y]>9)
					System.out.print("| "+array.readArray(n)[i][y]+" | ");
				else
				System.out.print("| "+array.readArray(n)[i][y]+"  | ");
			}
			System.out.println();
			for (int i=0;i<n;i++)
				System.out.print("+====+ ");
			System.out.println();
		} 
		array.columnSort();
		for (int i=0;i<(int)n/2;i++)
			System.out.print("    ");
		System.out.println("Array After Sorted");
		for (int i=0;i<(int)n/2;i++)
			System.out.print("    ");
		System.out.println("-------------------");
		for (int y=0;y<5;y++){
			for (int i=0;i<n;i++)
				System.out.print("+====+ ");
			System.out.println();
			for (int i=0;i<n;i++){
				if (array.readArray(n)[i][y]>9)
					System.out.print("| "+array.readArray(n)[i][y]+" | ");
				else
				System.out.print("| "+array.readArray(n)[i][y]+"  | ");
			}
			System.out.println();
			for (int i=0;i<n;i++)
				System.out.print("+====+ ");
			System.out.println();
		}
	}
}