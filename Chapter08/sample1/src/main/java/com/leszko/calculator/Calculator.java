package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
* Calculator Application that returns the sum of two integers.
*/
@Service
public class Calculator {
        final static int UML_NUMBER_1 = 3;
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}
}
