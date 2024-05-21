package com.deadveloper.tutorial;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        File f = new File("./320px-Oceanus-es.png");
        assertTrue( f.exists() );
    }
}
