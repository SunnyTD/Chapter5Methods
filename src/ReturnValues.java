/**
 * ,
 */

public class ReturnValues
{
    public static void main(String[] args)
    {
    }
    // eliminates the variable otherwise needed in the body of the method by putting the equasion at the return
    // expression.
//    public static double cubeVolume(double sideLength)
//    {
//        return sideLength * sideLength * sideLength;
//    }

    // Also useful at exiting the expression early
//    public static double cubeVolume(double sideLength)
//    {
//        if (sideLength >= 0)
//        {
//            return sideLength * sideLength * sideLength;
//        }
//        // Remember to include the else statement! (otherwise, the case(s) where the else statement applies will
// cause
//        // issues)
//        else
//        {
//            return 0;
//        }

    // Instead of using multiple returns, it is possible to only have one return by storing a method result in a
    // variable that I recall at the end of the method. (return)

    public static double cubeVolume(double sideLength)
    {
        double volume; // Remember to initiate variables that are used outside of logic exception logic!
        if (sideLength >= 0)
        {

            volume = sideLength * sideLength * sideLength; // uses "double volume" in place of "return"
        }
        else
        {
            volume = 0; // uses "double volume" in place of "return"
        }
        return volume;
    }
}

