package ObjectOrientedDesign;
import java.util.*;

class Book{
	private long ID;
	private String details;
	private static Set<Book> books;
	
	public Book(long ID, String details){
		this.ID = ID;
		this.details = details;
	}
	
	public long getID(){
		return ID;
	}
	public static void addBook(long ID, String details){
		books.add(new Book(ID, details));
	}
	public void update(){}
	public static void delete(Book b){
		books.remove(b);
	}
	public static Book find(long id){
		for(Book b : books){
			if(b.getID() == id){
				return b;
			}
		}
		return null;
	}	
}
/*
class User{
	private long ID;
	private String details;
	private int accountType;
	private static Set<User> users;
	
	public User(long ID, String details, int accountType){
		this.ID = ID;
		this.details = details;
		this.accountType = accountType;
	}
	
	public long getID(){
		return this.ID;
	}
	public Book searchLibrary(long id){
		return Book.find(id);
	}
	public void renewMemebership(){}
	public static User find(long ID){
		for(User u : users){
			if(u.getID() == ID){
				return u;
			}
			
		}
		return null;		
	}
	
	public static void addUser(long ID, String details, int accountType){
		users.add(new User(ID, details, accountType));
	}
}

public class OnlineReaderSystem {
	private Book b;
	private User u;
	public OnlineReaderSystem(Book b, User u){
		this.b = b;
		this.u = u;
	}
	public void listenRequest(){}
	public Book searchBook(long ID){
		return b.find(ID);
	}
	public User searchUser(long ID){
		return u.find(ID);
	}
	public void display(){}

}
