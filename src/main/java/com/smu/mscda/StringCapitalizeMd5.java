package com.smu.mscda;

import org.apache.commons.codec.digest.DigestUtils;
import java.util.Scanner;

public class StringCapitalizeMd5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a lowercase string:");
        String userInput = scanner.nextLine();

        // Capitalize the input string
        String capitalizedString = capitalizeString(userInput);

        // Generate MD5 hex representation
        String md5Hex = generateMD5Hex(capitalizedString);

        // Results
        System.out.println("Capitalized String: " + capitalizedString);
        System.out.println("MD5 Hex: " + md5Hex);

        scanner.close();
    }

    public static String capitalizeString(String input) {
        return input.toUpperCase();
    }

    public static String generateMD5Hex(String input) {
        return DigestUtils.md5Hex(input);
    }
}
