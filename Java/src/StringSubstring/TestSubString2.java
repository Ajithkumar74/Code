package StringSubstring;


import java.util.*;  

public class TestSubString2  
{    
    public static void main(String args[])  
    {    
        String text= new String("Hello, My name is Sachin");  
        /* Splits the sentence by the delimeter passed as an argument */  
        String[] sentences = text.split("\\.");  
        System.out.println(Arrays.toString(sentences));  
    }  
}    