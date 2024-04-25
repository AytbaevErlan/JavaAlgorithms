package org.example.algorithms.string;

public class Algorithms {

    public static boolean isUpperCase(String s){
       return s.chars().allMatch(Character::isUpperCase);

    }

    public static boolean isLowercase(String s){
        //we can also use noneMatch() method too:
        // return s.chars().allMatch(Character::isUpperCase);
        return s.chars().allMatch(Character::isLowerCase);
    }

    public static void main(String[] args) {
        System.out.println(isUpperCase("hello"));
        System.out.println(isUpperCase("HELLO"));
        System.out.println();

        System.out.println(isLowercase("hello"));
        System.out.println(isLowercase("HELLO"));
        System.out.println();

        System.out.println("Checking password complexity: ");
        System.out.println(isPasswordComplex("Name123!"));
        System.out.println();

        System.out.println(normalizeString("   Hello there, it is function to normalize STRING  "));
    }

    public static boolean isPasswordComplex(String s){
        return s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isDigit);
    }

    public static String normalizeString(String s){
        return s.toLowerCase().trim().replace(",", "");

//        String lowerCased = s.toLowerCase();
//        String trimmed = lowerCased.trim();
//        String replaced = trimmed.replace(",", "");

    }
}
