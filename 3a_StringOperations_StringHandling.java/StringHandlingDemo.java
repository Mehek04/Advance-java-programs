package assignment;

public class StringHandlingDemo {
	    public static void main(String[] args) {
	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = new String("World");
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        System.out.println("str1 equals str2: " + str1.equals(str2));
	        System.out.println("str1 compared to str2: " + str1.compareTo(str2));
	        System.out.println("str1 equalsIgnoreCase 'hello': " + str1.equalsIgnoreCase("hello"));

	        // 4. String Searching
	        String str3 = "Hello World";
	        System.out.println("Index of 'World' in str3: " + str3.indexOf("World"));
	        System.out.println("Last index of 'l' in str3: " + str3.lastIndexOf('l'));

	        // 5. Substring Operations
	        System.out.println("Substring from index 6: " + str3.substring(6));
	        System.out.println("Substring from index 0 to 5: " + str3.substring(0, 5));

	        // 6. String Modification
	        System.out.println("Replace 'World' with 'Java': " + str3.replace("World", "Java"));
	        System.out.println("To Uppercase: " + str3.toUpperCase());
	        System.out.println("To Lowercase: " + str3.toLowerCase());

	        // 7. Whitespace Handling
	        String strWithSpaces = "   Hello Java   ";
	        System.out.println("Original with spaces: '" + strWithSpaces + "'");
	        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

	        // 8. String Concatenation
	        String concatResult = str1.concat(" ").concat(str2);
	        System.out.println("Concatenated String: " + concatResult);

	        // 9. String Splitting
	        String sentence = "Java is fun to learn";
	        String[] words = sentence.split(" ");
	        System.out.println("Split Words:");
	        for (String word : words) {
	            System.out.println(word);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");
	        sb.insert(5, ",");
	        sb.replace(6, 11, " Java");
	        sb.delete(0, 1);
	        System.out.println("StringBuilder Result: " + sb.toString());

	        // 11. String Formatting
	        String name = "Alice";
	        int age = 25;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("Formatted String: " + formatted);

	        // 12. Validate Email with contains(), startsWith(), endsWith()
	        String email = "example@domain.com";
	        if (email.contains("@") && email.contains(".") &&
	            email.startsWith("example") && email.endsWith(".com")) {
	            System.out.println("Valid Email Format");
	        } else {
	            System.out.println("Invalid Email Format");
	        }
	    }
	}


