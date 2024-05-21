package com.deadveloper.tutorial;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        File f = new File("320px-Oceanus-es.png");
        if(f.exists() && !f.isDirectory()) { 
            System.out.println("The File Exists");
        }
    }
}
