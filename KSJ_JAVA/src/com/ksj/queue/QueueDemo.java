package com.ksj.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args)
	{
		Queue<String> queue =new PriorityQueue<>();
      
		queue.add("India");
		queue.add("Germany");
		queue.add("America");
		System.out.println("original queue:"+queue);
		
	}

}
