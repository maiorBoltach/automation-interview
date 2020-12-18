package com.epam.ta.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectTests extends CommonConditions {
	@Test
	public void canOpenPageObject()
	{
		Assert.assertEquals(1, 2, "Fail");
	}
}
