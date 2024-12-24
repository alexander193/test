package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(processLine("a1ss    2d"));
    }
    public static String processLine(String line) {
        String reverse = "";
        for (int i = (line.length() - 1); i >= 0; i--) {
            reverse += line.charAt(i);
        }
        String noNum = "";
        for (int i = 0; i < reverse.length(); i++) {
            if (reverse.charAt(i) >= '0' && reverse.charAt(i) <= '9')
                continue;
            noNum += reverse.charAt(i);
        }
        String noSpace = "";
        for (int i = 0; i < noNum.length(); i++) {
            if (noNum.charAt(i) == ' ' || noNum.charAt(i) == '\t') {
                noSpace += '_';
            }
            else
                noSpace += noNum.charAt(i);
        }
        return "LOG" + noSpace;
    }
}