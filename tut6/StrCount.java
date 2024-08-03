import java.util.*;

public class StrCount {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = obj.nextLine(); 

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 1; 
        int alphabetCount = 0;
        int digitCount = 0;
        int whiteSpaceCount = 0;

        boolean inWord = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCount++;
            if (Character.isLetter(c)) {
                alphabetCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if (Character.isWhitespace(c)) {
                whiteSpaceCount++;
                if (c == '\n') {
                    lineCount++;
                }
            }

            if (Character.isWhitespace(c)) {
                if (inWord) {
                    wordCount++;
                    inWord = false;
                }
            } else {
                inWord = true;
            }
        }

        
        if (inWord) {
            wordCount++;
        }

        System.out.println("Total characters: " + charCount);
        System.out.println("Total words: " + wordCount);
        System.out.println("Total lines: " + lineCount);
        System.out.println("Total alphabets: " + alphabetCount);
        System.out.println("Total digits: " + digitCount);
        System.out.println("Total white spaces: " + whiteSpaceCount);

        obj.close();
    }
}