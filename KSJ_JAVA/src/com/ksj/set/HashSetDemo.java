package com.ksj.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) 
	{
		Set<String> hashSet =new HashSet<String>();
		
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("C");
		
		System.out.println(hashSet);

	}

}
