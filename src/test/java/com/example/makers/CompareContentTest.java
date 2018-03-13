package com.example.makers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompareContentTest {
    private CompareContent content;

    @Before
    public void beforeEachTest() {
        content = new CompareContent("Img1", "Img2");
    }

    @Test
    public void getCodeSnippetOptionTwo() {
        assertEquals(content.getCodeSnippetOptionTwo(), "Img2");
    }

    @Test
    public void setCodeSnippetOptionTwo() {
        content.setCodeSnippetOptionTwo("Img3");
        assertEquals(content.getCodeSnippetOptionTwo(), "Img3");
    }

    @Test
    public void testingBeforeEach() {
        assertNotEquals(content.getCodeSnippetOptionTwo(), "Img3");
    }

    @Test
    public void getCodeSnippetOptionOne() {
        assertEquals(content.getCodeSnippetOptionOne(), "Img1");
    }

    @Test
    public void setCodeSnippetOptionOne() {
    }
}