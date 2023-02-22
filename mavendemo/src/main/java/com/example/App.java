package com.example;

import com.google.common.base.Joiner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Joiner joiner = Joiner.on("").skipNulls();

        String str = joiner.join("H", null, 'e', 'l', 'l', 'o', "world");
        
        System.out.println(str);
    
    }
}
