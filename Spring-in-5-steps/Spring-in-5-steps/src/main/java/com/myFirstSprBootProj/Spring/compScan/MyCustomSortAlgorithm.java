package com.myFirstSprBootProj.Spring.compScan;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.myFirstSprBootProj.Spring.basics.Springin5steps.SortAlgorithm;

@Component
//@Primary
public class MyCustomSortAlgorithm implements SortAlgorithm{
	public int sort() {
		System.out.println("inside my custom sort class!!!");
		return 9;
	}
}
