package string;

public class StringDemo {

    public static void main(String[] args) {
        
        String string1 = new String("Shrikant");
        String string2 = new String("Sarode");
        
        // Printing substring from index 5 to the end
        System.out.println(string1.substring(5)); // Output: kant

        // Uncommenting this line would print the substring from index 3 to 8
       System.out.println(string1.substring(3, 8)); 

        // Removed incorrect parameters from trim()
        System.out.println(string1.trim()); // Output: Shrikant

        // Converting string to upper case
        System.out.println(string1.toUpperCase()); // Output: SHRIKANT

        // Trimming and converting string to lower case
        System.out.println(string1.trim().toLowerCase()); // Output: shrikant

        // Finding index of character 't'
        System.out.println(string1.indexOf("t")); // Output: 6

        // Duplicate of the earlier trimmed and lowercased string
        System.out.println(string1.trim().toLowerCase()); // Output: shrikant

        // Replacing 'i' with 'aaa'
        System.out.println(string1.replace("i", "aaa")); // Output: Shraakant

        // Concatenating two strings
        System.out.println(string1.concat(string2)); // Output: ShrikantSarode
        
        // Checking equality of two strings
        if (string1.equals(string2)) {
            System.out.println("Same");
        } else {
            System.out.println("Not the same"); // Output: Not the same
        }
        
        // Splitting string based on space, but string1 doesn't contain any space
        String[] arr = string1.split(" ");
        
        // Printing each part of the split string
        for (String s : arr) {
            System.out.println(s); // Output: Shrikant
        }
    }
}
