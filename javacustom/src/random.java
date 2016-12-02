import java.io.File;
import java.util.Random;

class random {
	public static void main(String[] args){
		Random rand= new Random();
		int acak=0;
		for (int i=0;i<100;i++){
		acak=(rand.nextInt()*((int)System.currentTimeMillis())*i)%50+1;
		System.out.println(String.valueOf(acak));
		}
	}
}