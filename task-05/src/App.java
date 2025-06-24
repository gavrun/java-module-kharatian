
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        // 1
        
        String loremIpsum = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat";
        
        System.out.println("Original text:");
        System.out.println(loremIpsum);
        
        String longestWord = StringUtils.findLongestWord(loremIpsum);
//        System.out.println("Longest word: " + longestWord);
        System.out.printf("\nLongest word: %s", longestWord);

        // 2
        
        String wordToCheck = "Level";
        boolean isPalindrome = StringUtils.isPalindrome(wordToCheck);
        System.out.printf("\nIs '%s' a palindrome? %b", wordToCheck, isPalindrome);

        // 3
        
        String textWithBadWord = "This is a sample foo and another Foo in the text string";
        String censoredText = StringUtils.censorWord(textWithBadWord, "foo", "[censored]");
        System.out.printf("\nCensored text: %s", censoredText);

        // 4
        
        String text = "abc abcabc abcabcabc abc";
        String substring = "abc";
        int count = StringUtils.countSubstringOccurrences(text, substring);
        System.out.printf("\nNumber of occurrences of '%s': %d", substring, count);

        // 5
        
        String sampleText = "This is a test string";
        String reversedWords = StringUtils.reverseWordsInString(sampleText);
        System.out.printf("\nOriginal: %s\nReversed words: %s", sampleText, reversedWords);
	}

}
