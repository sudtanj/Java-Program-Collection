import java.util.ArrayList;
public class LibraryBookSort {
	public static void main(String[] args){
	ArrayList<Librarybook> data1 = new ArrayList<Librarybook>();
	data1.add(new Librarybook("jackiechan","soe",20));
	data1.add(new Librarybook("samuel","markus",40));
	data1.add(new Librarybook("yakult","suwandi",30));
	data1.add(new Librarybook("gyoza","gangnam",20));
	data1.add(new Librarybook("lakukan","vincent",10));
	String temp;
	for (int i=0;i<5;i++){
		for (int j=0;j<5;j++){
			if (data1.get(j).getTitle()<data1.get(j+1).getTitle()){
				temp=data1.get(j).getTitle();
				data1.get(j).setTitle(data1.get(j+1).getTitle());
				data1.get(j+1).setTitle(temp);
			}
		}
	}
	for (int j=0;j<5;j++){
	System.out.println(data1.get(j).getTitle()+data1.get(j).getAuthor());
	}
	}
}