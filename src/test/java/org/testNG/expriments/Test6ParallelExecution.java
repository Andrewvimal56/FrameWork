package org.testNG.expriments;

import org.testng.annotations.Test;

public class Test6ParallelExecution {
	@Test
	private void Test63() {
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void Test64() {
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void Test67() {
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void Test68() {
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void Test61() {
		System.out.println(Thread.currentThread().getId());
	}

}
