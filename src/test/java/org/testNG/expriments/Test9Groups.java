package org.testNG.expriments;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.netty.util.concurrent.FailedFuture;

public class Test9Groups {
	@Test(groups = "Reg")
	private void test91() {
		System.out.println("test91");
	}

	@Test
	private void test92() {
		Assert.assertTrue(false);
		System.out.println("test92");

	}

	@Test()
	private void test93() {
		System.out.println("test93");

	}

	@Test
	private void test94() {
		Assert.assertTrue(true);

		System.out.println("test94");

	}

	@Test(groups = "Smoke")
	private void test95() {
		System.out.println("test95");

	}

}
