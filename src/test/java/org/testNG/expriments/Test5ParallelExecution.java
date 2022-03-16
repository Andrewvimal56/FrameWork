package org.testNG.expriments;

import org.testng.annotations.Test;

public class Test5ParallelExecution {
	@Test
	private void Test53() {
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void Test54() {
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void Test57() {
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void Test58() {
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void Test51() {
		System.out.println(Thread.currentThread().getId());
	}

}
