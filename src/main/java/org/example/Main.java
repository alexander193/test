package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(processLine("a1ss    2d"));
        System.out.println(processLine("a1ss    2d"));
    }
    public static String processLine(String line) {
        StringBuilder reverse = new StringBuilder();
        for (int i = (line.length() - 1); i >= 0; i--) {
            reverse.append(line.charAt(i));
        }
        StringBuilder noNum = new StringBuilder();
        for (int i = 0; i < reverse.length(); i++) {
            if (reverse.charAt(i) >= '0' && reverse.charAt(i) <= '9')
                continue;
            noNum.append(reverse.charAt(i));
        }
        StringBuilder noSpace = new StringBuilder();
        for (int i = 0; i < noNum.length(); i++) {
            if (noNum.charAt(i) == ' ' || noNum.charAt(i) == '\t') {
                noSpace.append('_');
            }
            else
                noSpace.append(noNum.charAt(i));
        }
        return "LOG" + noSpace;
    }
}