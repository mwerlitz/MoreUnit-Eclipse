package org.moreunit.util;

import junit.framework.TestCase;

public class WordTokenizerTest extends TestCase {

	public void testWordTokenizer() {
		WordTokenizer wordTokenizer = new WordTokenizer("Oa");
		assertTrue(wordTokenizer.hasMoreElements());
		
		wordTokenizer = new WordTokenizer("OneTwoThree");
		assertTrue(wordTokenizer.hasMoreElements());
		assertEquals("One", wordTokenizer.nextElement());
		assertTrue(wordTokenizer.hasMoreElements());
		assertEquals("Two", wordTokenizer.nextElement());
		assertTrue(wordTokenizer.hasMoreElements());
		assertEquals("Three", wordTokenizer.nextElement());
		assertFalse(wordTokenizer.hasMoreElements());
	}

}