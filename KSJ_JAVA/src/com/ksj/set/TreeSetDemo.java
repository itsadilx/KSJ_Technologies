package com.ksj.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args)
	{
		TreeSet<String> treeSet =new TreeSet<String>();
		
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("C");
		
		System.out.println(treeSet);

	}

}
