package org.testNG.expriments;

import org.testng.annotations.Test;

public class Test8Groups {
	@Test(groups="Reg")
	private void test81() {
		System.out.println("test81");
	}

	@Test(groups="Reg")
	private void test82() {
		System.out.println("test82");
	}

	@Test(groups="Sanity")
	private void test83() {
		System.out.println("test83");
	}

	@Test(groups="Reg")
	private void test84() {
		System.out.println("test84");
	}

	@Test(groups="Smoke")
	private void test85() {
		System.out.println("test85");
	}
}
