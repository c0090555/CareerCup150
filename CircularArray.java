package Java;

import java.util.Iterator; 
import java.lang.ref.*;
import java.lang.reflect.Array;


public class CircularArray<T> implements Iterable<T> {
	private T[] items;
	private int head;

	
	public CircularArray(Class<T> c, int size){
		items = (T[]) Array.newInstance(c, size);
	}
	
	//reusable code
	private int convert(int index){
		if(index < 0){
			index += items.length;
		}
		return (head + index) % items.length;
	}
		
	public void rotate(int shiftRight){
		head = convert(shiftRight);
	}
	
	public T get(int i){
		if(i < 0 || i >= items.length)
			throw new java.lang.IndexOutOfBoundsException("...");
		
		return items[convert(i)];
	}
	
	public void set(int i, T item){
		items[convert(i)] = item ;
	}
	
	public Iterator<T> iterator(){
		return new CircularArrayIterator<T>(this);
	}
	
	 private class CircularArrayIterator<T> implements Iterator<T>{
		 private int _current = -1;
		 private T[] _items;
		 
		 public CircularArrayIterator(CircularArray<T> array){
			 _items = array.items;
		 }
		 
		 @Override
		 public boolean hasNext(){
			 return _current < _items.length - 1;
		 }
		 
		 @Override 
		 public T next(){
			 _current ++;
			 T item = _items[convert(_current)];
			 return item;
		 }
		 
		 @Override
		 public void remove(){
			 throw new java.lang.UnsupportedOperationException("...");
		 }
		 
		 
		
		 
	 }
	
	public static void main(String[] args){
		
		CircularArray<Integer> a = new CircularArray<Integer>(Integer.class,10);
		System.out.println(a.items.length);
		for(int i = 0; i <= a.items.length - 1; i++){
			a.items[i] = i;
		}
		
		for(Integer t : a){
			System.out.println(t);
		}
	
	}
	
	
	
	
	
}
