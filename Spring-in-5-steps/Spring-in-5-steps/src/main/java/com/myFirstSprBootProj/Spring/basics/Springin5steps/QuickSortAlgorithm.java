package com.myFirstSprBootProj.Spring.basics.Springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
	public int sort() {
		System.out.println("inside Quick sort class!!!");
		return 6;
	}
}
