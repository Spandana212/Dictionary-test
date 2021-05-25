package automation.dictionaryTest;


import org.junit.Test;

import junit.framework.Assert;

public class UnitTest {
	
	@Test
	public void test1(){
		
		boolean result = Dictionary.isEnglishWord("row");
		Assert.assertEquals(true, result);
	}

	
	@Test
	public void test2(){
		
		boolean result = Dictionary.isEnglishWord("kin");
		Assert.assertEquals(false, result);
	}

}
