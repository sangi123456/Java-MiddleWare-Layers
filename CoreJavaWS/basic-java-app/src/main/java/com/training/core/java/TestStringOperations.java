package com.training.core.java;

import com.training.core.java.basic.*;

public class TestStringOperations {

      public static void main(String[] args)
{
StringOperations strObject;
strObject = new StringOperations();

String result = strObject.convertToUppercase("hello");
System.out.println("UpperCase String-" + result);

result = strObject.convertToUppercase("hello world");
System.out.println("UpperCase String-" + result);

result = strObject.convertToUppercase(" ");
System.out.println("UpperCase String-" + result);

result = strObject.convertToUppercase("he##%%@@llo");
System.out.println("UpperCase String-" + result);

boolean flag = StringOperations.compareTwoStrings("Hello", "Hello");
System.out.println("Strings are equal - " + flag);
}
}