
public class StringUtils {

	/**
	 * Class does something with strings
	 * @param param_name
	 * @param param_name
	 */
	
    public static String findLongestWord(String text) {
        String[] words = text.split(" "); 
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static boolean isPalindrome(String word) {
        String lowerWord = word.toLowerCase();
        String reversed = new StringBuilder(lowerWord).reverse().toString();
        return lowerWord.equals(reversed); 
    }

    public static String censorWord(String text, String badWord, String replacement) {
        return text.replaceAll("(?i)" + badWord, replacement); // regex 
    }

    public static int countSubstringOccurrences(String text, String substring) {
        int count = 0;
        int index = 0;
        text = text.toLowerCase();
        substring = substring.toLowerCase();
        while ((index = text.indexOf(substring, index)) != -1) {
            count++; 
            index += substring.length(); 
        }
        return count;
    }

    public static String reverseWordsInString(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim();
    }
    
}
