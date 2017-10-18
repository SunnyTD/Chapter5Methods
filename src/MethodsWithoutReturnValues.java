/**
 * ,
 */

public class MethodsWithoutReturnValues
{
    public static void main(String[] args)
    {
        // Prints out "Hello World" in boxes. (Vertical sides are "!")
        boxString("Hello");
        boxString("World");
        // Note: Cannot use boxString in an expression like (example = boxString("Hello")), because the boxString
        // method doesn't actually return any value.
    }
    // A method can return an output with no value; ex. below

    /**
     * Prints a string in a box
     *
     * @param contents the string to enclose in a box
     */
    public static void boxString(String contents)
    {
        int n = contents.length();
        // returns from a void method so it doesn't execute the rest of the code.
        if (n == 0)
        {
            return; // Return (exit) immediately
        }
        for (int i = 0; i < n + 2; i++)
        {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("!" + contents + "!"); // Change "!" to "|" to get more boxy structure.
        for (int i = 0; i < n + 2; i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }
}
