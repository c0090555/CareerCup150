package ObjectOrientedDesign;

import java.util.*;
enum StatusType{
	online, offline, away;
}

class Status{
	StatusType status_type;
	String status_message;
}

class User{
	String username;
	String display_name;
	Status status;
	ArrayList<User> contact_list = new ArrayList<User>();
	ArrayList<AddRequest> requests = new ArrayList<AddRequest>();
	
	User(String username){
		this.username = username;
	}
	
	boolean updateStatus(StatusType stype, String message){
		this.status.status_type = stype;
		this.status.status_message = message;
		return true;
	}
	boolean addUserWithUsername(String name){
			User nuser = new User(name);
			contact_list.add(nuser);
			return true;
	}
	boolean approveRequest(String username){
		User nuser = new User(username);
		AddRequest newRequest = new AddRequest(nuser, this);
		return true;
	}
	boolean denyRequset(String username){
		 return true;
	}
	boolean removeContact(String username){
		User removedUser = new User(username);
		contact_list.remove(removedUser);
		return true;
	}
	boolean sendMessage(String username, String message){
		return true;
	}
	
	

}

public class ChatServer {
	String username;
	User getUserByUsername= new User(username);
}

class AddRequest{
	User from_user;
	User to_user;
	AddRequest(User from_user, User to_user){
		this.from_user = from_user;
		this.to_user = to_user;
	}
}