package com.max.behavioral.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Everyday example of the Interpreter pattern using the Java Pattern class
*/
public class InterpreterEverydayDemo {

    public static void main(String[] args) {
        String input = "Lions, and tigers, and bears! Oh my!";

        Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger)");
        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.println("Found a " + m.group() + ".");
        }
    }
}
