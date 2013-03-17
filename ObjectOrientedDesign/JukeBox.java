package ObjectOrientedDesign;
import java.util.*;

class CD{}

class CDPlayer{
	private PlayList p;
	private CD c;
	
	public PlayList getPlayList(){
		return p;
	}
	public void setPlayList(PlayList p){
		this.p = p;
	}
	
	public CD getCD(){
		return c; 
	}
	public void setCD(CD c){
		this.c = c;
	}
	
	public CDPlayer(PlayList p){
		this.p = p;
	}
	public CDPlayer(PlayList p, CD c){
		this.p = p;
		this.c = c;
	}
	public CDPlayer(CD c){
		this.c = c;
	}
	
	public void playTrack(Song s){}		
}



public class JukeBox {
	private CDPlayer cdPlayer;
	private User user;
	private Set<CD> cdCollection;
	private TrackSelector ts;
	
	public JukeBox(CDPlayer cdPlayer, User user, Set<CD> cdCollection, TrackSelector ts){
		this.cdPlayer = cdPlayer;
		this.user = user;
		this.cdCollection = cdCollection;
		this.ts = ts;
	}
	
	public Song getCurrentTrack(){
		return ts.getCurrentSong();
	}
	public void processOneUser(User u){
		this.user = u;
	}
	
}

class PlayList{
	private Song track;
	private Queue<Song> queue;
	public PlayList(Song track, Queue<Song> queue){}
	public Song getNextTrackToPlay(){
		return queue.peek();
	}
	public void queueUpTrack(Song s){
		queue.add(s);
	}
}

class Song{
	private String songName;
}

class TrackSelector{
	private Song currentSong;
	public TrackSelector(Song s){
		currentSong = s;
	}
	public void setTrack(Song s){
		currentSong = s;
	}
	public Song getCurrentSong(){
		return currentSong;
	}
}
/*
class User{
	private String name;
	private long ID;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public long getID(){
		return ID;
	}
	public void setID(long ID){
		this.ID = ID;
	}
	
	public User(String name, long ID){
		this.name = name;
		this.ID = ID;
	}
	
	public User getUser(){
		return this;
	}
	
	
	public static User addUser(String name, long ID){ 
		User u = new User(name, ID);
		return u;};
}