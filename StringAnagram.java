//This program checks if two Strings are Anagram or not in Java

import java.util.Arrays;
public class StringAnagram {
    public static void main(String args[])
    {
        String str1 = "Listen";
        String str2 = "Silent";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length())
        {
            char c1[] = str1.toCharArray();
            char c2[] = str2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            boolean result = Arrays.equals(c1, c2);
            if(result)
            {
                System.out.println("It's an Anagram");
            }
            else
            {
                System.out.println("It's not an Anagram");
            }
        }
        else
        {
            System.out.println("It's not an Anagram");
        }
    }
}