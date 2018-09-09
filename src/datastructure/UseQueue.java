package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {

		Queue<String> students=new LinkedList<String>();
		students.add("Rahim");
		students.add("Karim");
		students.add("Saleem");
		students.add("Ahmed");
		students.remove();
		students.peek();
		students.poll();
		for(String ami: students){
			System.out.println("Remove names  :"+students.remove()+" Peek Names :"+students.peek()+" Poll Names :"+students.poll());

		}


		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

	}

}
