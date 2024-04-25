package org.example.algorithms;

public class ParsingString {

    public static boolean isAtEvenIndex(String s, char item) {
        if(s == null || s.isEmpty()) return false;

        for (int i = 0; i < s.length() / 2 + 1; i = i + 2) {
            if(s.charAt(i) == item){
                return true;
            }
        }

        return false;
    }

    public static void parseContains(String s) {
        System.out.println("Option 1");
        for (char c : s.toCharArray()) {
            System.out.println(c);
        }

        System.out.println();
        System.out.println("Option 2");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        String s = "HeLLo";
        System.out.println(s.contains("LL"));

        parseContains(s);
        System.out.println();


        System.out.println("Is at even index:");
        System.out.println(isAtEvenIndex(s, 'L'));
        System.out.println(isAtEvenIndex(s, 'T'));
        System.out.println(isAtEvenIndex(s, 'H'));
        System.out.println(isAtEvenIndex("", 'H'));
        System.out.println(isAtEvenIndex(null, 'H'));
    }


}
