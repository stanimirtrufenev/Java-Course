import java.util.ArrayList;


public class Library {

	private String name;
	private String address;
	private ArrayList<Book>books=new ArrayList<Book>();
	
	public Library() {
		super();
		
	}

	public Library(String name, String address, ArrayList<Book> books) {
		super();
		this.name = name;
		this.address = address;
		this.books = books;
	}
	 
	public void addBook(Book new1){
		books.add(new1);
	}
	public void removeBook(Book new1){
		books.remove(new1);
	}
	public void print(){
		System.out.print(name);
		System.out.print(address);
		System.out.println();
		
       for(int i=0;i<books.size();i++){
    	   System.out.println(books.get(i).getAutor());
    	   System.out.println(books.get(i).getName());
    	   System.out.println(books.get(i).getPage());
       }
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdres() {
		return address;
	}

	public void setAdres(String address) {
		this.address = address;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
}