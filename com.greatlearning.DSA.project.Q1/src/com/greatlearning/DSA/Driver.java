package com.greatlearning.DSA;

import java.util.*;

public class Driver {
	
	public static void main (String []args ) {
		System.out.println("Enter the total no of floors in the building : ");
		
		Scanner sc = new Scanner ( System.in);
		int totalFloors = sc.nextInt();
		
		// Create array to take inputs for the floor sizes
		int floorSize[] = new int [totalFloors];
		
		//Loop to receive inputs 
		for (int i = 0; i < totalFloors; i ++  ) {
			System.out.println("Enter Floor size on the Day" + ( i + 1 ) + ":");
			floorSize[i] = sc.nextInt();
	}
		Service service = new Service();
		service.constructionPlan(floorSize, totalFloors);
	}

    }
