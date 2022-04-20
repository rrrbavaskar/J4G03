package begin6;

import java.util.ArrayList;
import java.util.Collections;

public class ListSort {

	public static void main(String[] args) {
		ArrayList<movie> list = new ArrayList<movie>();
		list.add(new movie(4.0, "Prajakta", 2009));
		list.add(new movie(5.0, "Rutuja", 20));
		list.add(new movie(3.0, "Rohit", 2013));
		list.add(new movie(5.0, "Soham", 2012));
		list.add(new movie(4.0, "Sachin", 2006));
		
		System.out.println("BEFORE SORTING:");
		for(movie m : list) {
			System.out.println(m.getRating()+"  "+m.getName()+"  "+m.getYear());
		}
		
		Collections.sort(list);
		
		System.out.println();
		System.out.println("AFTER SORTING:");
		for(movie m : list) {
			System.out.println(padLeft(String.valueOf(m.getRating()),5)+"   "+padRight(m.getName(),25)+"    "+m.getYear());
		}
	}

	public static String padRight(String data, int length) {
		StringBuffer buf = new StringBuffer(data);
		for(int i=buf.length(); i<length; i++) buf.append(" ");
		return buf.toString();
	}

	public static String padLeft(String data, int length) {
		StringBuffer buf = new StringBuffer(data);
		for(int i=buf.length(); i<length; i++) buf.insert(0," ");
		return buf.toString();
	}
}