package vn.t3h.ls5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BaiTap1 
{
	private static final int ELCOUNT = 50000;
	
	public static void main(String[] args) {
		List<String> alist = new ArrayList<String>();
		List<String> llist = new LinkedList<String>();
		// Insertion ////////////////
		// ArrayList
		long start = System.currentTimeMillis();
		for (int i = 0; i < ELCOUNT; i++) {
			alist.add("element #" + i);
		}
		long totalTimeMs = System.currentTimeMillis() - start;
		System.out.println("Adding 50K elements in ArrayList took " + totalTimeMs + " ms");
		// LinkedList
		start = System.currentTimeMillis();
		for (int i = 0; i < ELCOUNT; i++) {
			llist.add("element #" + i);
		}
		totalTimeMs = System.currentTimeMillis() - start;
		System.out.println("Adding 50K elements in LinkedList took " + totalTimeMs + " ms");
		// Modification /////////////
		// ArrayList
		start = System.currentTimeMillis();
		for (int i = 0; i < ELCOUNT; i++) {
			alist.set(i, "modified element #" + i);
		}
		totalTimeMs = System.currentTimeMillis() - start;
		System.out.println("Modifying 50K elements in ArrayList took " + totalTimeMs + " ms");
		// LinkedList
		start = System.currentTimeMillis();
		for (int i = 0; i < ELCOUNT; i++) {
			llist.set(i, "modified element #" + i);
		}
		totalTimeMs = System.currentTimeMillis() - start;
		System.out.println("Modifying 50K elements in LinkedList took " + totalTimeMs + " ms");
		// Removal //////////////////
		System.out.println("ArrayList size before removal " + alist.size());
		System.out.println("LinkedList size before removal " + llist.size());
		// ArrayList
		start = System.currentTimeMillis();
		for (int i = 0; i < ELCOUNT; i++) {
			alist.remove(0);
		}
		totalTimeMs = System.currentTimeMillis() - start;
		System.out.println("Removing 50K elements in ArrayList took " + totalTimeMs + " ms");
		// LinkedList
		start = System.currentTimeMillis();
		for (int i = 0; i < ELCOUNT; i++) {
			llist.remove(0);
		}
		totalTimeMs = System.currentTimeMillis() - start;
		System.out.println("Removing 50K elements in LinkedList took " + totalTimeMs + " ms");
		System.out.println("ArrayList size after removal " + alist.size());
		System.out.println("LinkedList size after removal " + llist.size());
	}
}
