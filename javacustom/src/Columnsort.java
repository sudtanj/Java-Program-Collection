import java.util.Scanner;
import java.util.Random;
public class Columnsort {
	private int[][] array;
	private int n;
	public Columnsort (int n) {
		array=new int[n][5];
		this.n=n;
	}
	public void setArray(int angka,int column, int row){
		this.array[column][row]=angka;
	}
	public void columnSort(){
		int temp;
		for(int k=0;k<n;k++){
			for(int i=0;i<5;i++){
				for(int y=1;y<5-i;y++){
				if(array[k][y-1]>array[k][y]){
				temp=array[k][y-1];
				array[k][y-1]=array[k][y];
				array[k][y]=temp;
				}
				}
			}
		}
	}
	public int[][] readArray(int n){
		int[][] temp=new int[n][5];
		for (int y=0;y<n;y++){
			for (int i=0;i<5;i++){
			  temp[y][i]=array[y][i];
			}
		}
		return temp;
	}
}