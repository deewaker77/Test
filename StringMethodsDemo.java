public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "  Hello, Java World!  ";
        String substr = "Java";

        // contains()
        System.out.println("Contains 'Java': " + str.contains(substr));

        // substring()
        System.out.println("Substring (7, 11): " + str.substring(7, 11));

        // join()
        String joinedStr = String.join("-", "Hello", "World");
        System.out.println("Joined String: " + joinedStr);

        // replace()
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // replaceAll()
        System.out.println("ReplaceAll vowels with '': " + str.replaceAll("[AEIOUaeiou]", ""));

        // replaceFirst()
        System.out.println("ReplaceFirst 'o' with '@': " + str.replaceFirst("o", "@"));

        // charAt()
        System.out.println("Character at index 7: " + str.charAt(7));

        // getBytes()
        byte[] bytes = str.getBytes();
        System.out.println("Byte array: " + java.util.Arrays.toString(bytes));

        // indexOf()
        System.out.println("Index of 'J': " + str.indexOf('J'));

        // compareTo()
        System.out.println("CompareTo 'Hello': " + str.compareTo("Hello"));

        // compareToIgnoreCase()
        System.out.println("CompareToIgnoreCase 'hello': " + str.compareToIgnoreCase("hello"));

        // trim()
        System.out.println("Trimmed String: '" + str.trim() + "'");

        // format()
        String formattedStr = String.format("Welcome, %s!", "User");
        System.out.println("Formatted String: " + formattedStr);

        // split()
        String[] words = str.split(" ");
        System.out.println("Split String: " + java.util.Arrays.toString(words));

        // toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // valueOf()
        int number = 100;
        System.out.println("String value of 100: " + String.valueOf(number));

        // toCharArray()
        char[] charArray = str.toCharArray();
        System.out.println("Char Array: " + java.util.Arrays.toString(charArray));

        // matches()
        System.out.println("Matches '.Java.': " + str.matches(".Java."));

        // startsWith()
        System.out.println("Starts with '  Hello': " + str.startsWith("  Hello"));

        // endsWith()
        System.out.println("Ends with 'World!  ': " + str.endsWith("World!  "));

        // isEmpty()
        String emptyStr = "";
        System.out.println("Is empty: " + emptyStr.isEmpty());
    }
}