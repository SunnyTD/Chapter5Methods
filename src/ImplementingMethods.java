/**
 * ,
 */

public class ImplementingMethods
{
    //<editor-fold desc = "5.2: Implementing Methods"

    // main method below
    public static void main(String[] args)
    {
        double result1 = cubeVolume(2);
        double result2 = cubeVolume(10);
        System.out.println("A cube with side length 2 has volume: " + result1);
        System.out.println("A cube with side length 10 has volume: " + result2);
    }

    /**
     * Javadoc Documentation
     * Computes volume of a cube
     *
     * @param sideLength: the side length of said cube
     * @return : Outputs volume to a variable. Variable is stated in the same method that cubeVolume is referenced in.
     * Does NOT output to the command line; only the assigned variable.
     */
    // cubeVolume method below
    public static double cubeVolume(double sideLength)
    {
        double volume = sideLength * sideLength * sideLength;
        return volume;
    }

    //</editor-fold

    //<editor-fold desc = "Programming tip 5.2: Don't modify parameters"

    // Don't modify a value of a parameter variable in the body of a method. (below ex.)
//    public static int totalCents(int dollars, int cents)
//    {
//        cents = dollars * 100 + cents;
//        return cents;
//    }

    // Do this instead:
    public static int totalCents(int dollars, int cents)
    {
        int result = dollars * 100 + cents;
        return result;
    }

    //</editor-fold
}
