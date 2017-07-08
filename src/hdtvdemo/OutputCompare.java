package hdtvdemo;

import java.util.ArrayList;
import java.util.Collections;
/*
 * The ArrayList contains user defined objects. 
 * By using Collections.sort() method you can sort the ArrayList. 
 * */
public class OutputCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HDTV> list = new ArrayList<HDTV>();
		list.add(new HDTV("Sony",60));
		list.add(new HDTV("LG",56));
		list.add(new HDTV("Samsung",70));
		
		Collections.sort(list,new SizeCompare());
        System.out.println("Sorted list entries: ");
        for(HDTV e:list){
            System.out.println(e);
        }
	}

}
