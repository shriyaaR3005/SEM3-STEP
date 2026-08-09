import java.util.*;

public class Shortestandlongest {
    static String[] findShortestAndLongestWord(String text) {
        String[] words = text.replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");

        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length())
                shortest = word;

            if (word.length() > longest.length())
                longest = word;
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String[] result = findShortestAndLongestWord(text);

        System.out.println("Shortest: \"" + result[0] + "\" (" + result[0].length() + ")");
        System.out.println("Longest: \"" + result[1] + "\" (" + result[1].length() + ")");
    }
}