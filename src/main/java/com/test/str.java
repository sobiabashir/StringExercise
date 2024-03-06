package com.test;

import java.util.Scanner;

public class str {
    private String str ;
    Scanner scanner = new Scanner(System.in);

    public void string1() {
        System.out.println();
        System.out.println("Question # 1 ");
        str="JAVA";
        System.out.println(str.length());
    }
    public void string2() {
        System.out.println();
        System.out.println("Question # 2 ");
        str="Long example sentence";
        System.out.println(str.charAt(6));

    }
    public void string3() {
        System.out.println();
        System.out.println("Question # 3 ");
        String str3="Even longer example sentence";
        int index = str3.indexOf('o');
        System.out.println("Index position of 'o': " + index);

    }
    public void string4() {
        System.out.println();
        System.out.println("Question # 4 ");
        String givenString = "Ok this is not as long!";
        String substring = givenString.substring(10, givenString.length() - 1);
        System.out.println(substring);
    }
    public void string5() {
        System.out.println();
        System.out.println("Question # 5 ");
        String firstString = "CAPS EQUALS SCREAMING";
        String lowercaseString = firstString.toLowerCase();
        System.out.println("Lowercase: " + lowercaseString);
        String uppercaseString = lowercaseString.toUpperCase();
        System.out.println("Uppercase: " + uppercaseString);
    }
    public void string6() {
        System.out.println();
        System.out.println("Question # 6 ");
        String originalString = "Java is the worst programming language!";
        String correctedString = originalString.replace("worst", "best");
        System.out.println(correctedString);
    }
    public void string7() {
        System.out.println();
        System.out.println("Question # 7 ");
        int number = 20;
        String result = number + "20";
        System.out.println(result);
    }

    public void string8() {
        System.out.println();
        System.out.println("Question # 8 ");
        String phrase = "Oil and Water";
        String[] words = phrase.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public void string9() {
        System.out.println();
        System.out.println("Question # 9 ");
        String namesString = "Carl,Susie,Fredrick,Bob,Erik";
        String[] namesArray = namesString.split(",");
        for (String name : namesArray) {
            System.out.println(name);
        }
    }
    public void string10() {
        System.out.println();
        System.out.println("Question # 10 ");
        String inputString = "Hello World !";
        char[] charArray = inputString.toCharArray();
        for (char ch : charArray) {
            if(ch==' ')
            {
                continue;
            }
            System.out.println(ch);
        }
    }
    public void string11() {
        System.out.println();
        System.out.println("Question # 11 ");
        char[] charArray = {'J', 'a', 'v', 'a'};
        String result = new String(charArray);
        System.out.println(result);
    }



}