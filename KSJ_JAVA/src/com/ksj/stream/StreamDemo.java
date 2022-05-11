package com.ksj.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> numbersList =new ArrayList<>();
		numbersList.add(10);
	    numbersList.add(20);
	    numbersList.add(30);
	    numbersList.add(40);
	    
	//    List<Integer> squaresList =new ArrayList<>();
	  //  for (Integer i: numberList) {
	    //	squaresList.add(i*i);
	    
	    
	List<Integer> squaresList =numbersList.stream().map(x->x*x).collect(Collectors.toList());
	System.out.println("List of squared numbers:"+ squaresList);
	    
	    
	    }

}
