package com.myFirstSprBootProj.Spring.basics.Springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
public int sort() {
	System.out.println("inside bubble sort class!!!");
	return 2;
}
}
