import java.util.ArrayList;


public class Final {

	public static void main(String[] args) {
		
		ArrayList<Book>book=new ArrayList<Book>();
		
		book.add(new Book("Chervenata Shapchica", "Paolo", 100));
		
		Library new1=new Library("Fantastiko ", "Sofia", book);
		
		Book new2=new Book("Kotarakut v chismi", "Stanimir", 231);
		
		new1.addBook(new2);
		
		new1.removeBook(new2);
		
		new1.print();
	}

}