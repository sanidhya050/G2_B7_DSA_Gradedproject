package com.greatlearning.DSA;

import java.util.*;

public class Service {
	
	public void constructionPlan(int floorSize [] , int totalFloors) {
	
	/* Create priority queue with reverse order of the natural priority 
	 * i.e , after reversing --> higher the number , higher the priority .
	 */
	
        PriorityQueue<Integer> floorQueue = new PriorityQueue<> (java.util.Collections.reverseOrder());
	
	       System.out.println("The Order of construction is as follows : ");
	       int maxFloorSize = totalFloors;
	
	       for(int i = 0; i<totalFloors;i++) {
		   System.out.println("Day" + (i+1) + ":");
		
		   // add array element into the priority queue (PQ)
		
		   floorQueue.add(floorSize[i]);
		
		   // using peak method look for the higher value
	       while (!floorQueue.isEmpty() && floorQueue.peek() == maxFloorSize) {
		
		   // Using poll remove the value from PQ
		
		   System.out.println(floorQueue.poll() + " ");
		
		   // once the highest value in its place , then reduce the floor size by 1 
		
		   maxFloorSize--;
		
		   System.out.println();
	  }
	}
  }	
}
