package StringIntroduction;
import java.util.Arrays;
public class Class_01 {
    public static void main(String[] args) {
        // Introduction to String .
        String name = "Priyanshu";
        String name2 = "priyanshu";
        System.out.println(name.length()); // Length of the String.
        System.out.println(name.charAt(5)); // search element with index value .
        // How to covert String into array String
        char[] ch = name.toCharArray(); // convert the String into arrayString .
        System.out.println(Arrays.toString(ch)); // print in array format .
        System.out.println(name.substring(0,5)); // starting is included and ending is excluded.
        System.out.println(name.equals(ch)); // comparison operation to check two String .
        System.out.println(name.equalsIgnoreCase(name2)); // ignore the lower and upper case.
        System.out.println(name.indexOf("s")); // give the index of the element .
        System.out.println(name.contains("23")); // check if the element is within the String .
    }
}
