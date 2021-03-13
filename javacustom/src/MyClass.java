import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;

public class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    int jmlArray = myObj.nextInt();  // Read user input 
	int target = myObj.nextInt();  // Read user input
    ArrayList<Integer> data=new ArrayList<>();
    for(int i=0;i<jmlArray;i++){
        data.add(myObj.nextInt());
    }
	for(int i=0;i<data.size();i++){
		for(int j=i+1;j<data.size();j++){
			if(data.get(i)+data.get(j)==target){
				System.out.println(i);
				System.out.println(j);
				System.out.println();
				return;
			}
		}
	}
      
  }
}