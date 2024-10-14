package com.myFirstSprBootProj.Spring.basics.Springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

@Autowired
SortAlgorithm sortAlgorithm;

	/*
	 * public BinarySearchImpl(SortAlgorithm sortAlgorithm) { super();
	 * this.sortAlgorithm = sortAlgorithm;
	 
}*/

	public int binarySearch() {
	
	//BubbleSortAlgorithm bsa = new BubbleSortAlgorithm();
	//QuickSortAlgorithm bsa = new QuickSortAlgorithm();

	int sortResult = sortAlgorithm.sort();
	if(sortResult > 0) {
		return sortResult;
	}
	return sortResult;
}
}
