public class Librarybook {
	private String Title;
	private String Author;
	private int Page;
	
	public Librarybook (String Title,String Author,int Page) {
		this.Title=Title;
		this.Author=Author;
		this.Page=Page;
	}
	public  String getTitle(){
		return Title;
	}
	public  String getAuthor(){
		return Author;
	}
	public  int getPage(){
		return Page;
	}
	public  void setTitle(String Title){
				this.Title=Title;
	}
	public  void setAuthor(String Author){
		this.Author=Author;
	}
	public  void setPage(int Page){
		this.Page=Page;
	}
}