package org.example;

class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        String test = "(()(()(";
        int stringLength = test.length();
        int result = 0;
        for (int i = 0; i < stringLength; i++) {
            char temp = test.charAt(i);
            if (temp == '(') {
                result++;
            } else if (temp == ')') {
                result--;
            } else throw new IllegalArgumentException("Unknown character");
        }
        System.out.println(result);
    }
}