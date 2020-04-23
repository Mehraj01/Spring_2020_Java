package SELF_PRACTICE.Replit_Practice;

import java.util.Scanner;

/*
using substring method, output the first two letters of text string
for examole:
String txt = "foo"
the first two letters are "fo"
---use print not println.
 */
public class Replit_StringSubstring {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        txt=txt.substring(0,2);
        System.out.print(txt);



    }
}
