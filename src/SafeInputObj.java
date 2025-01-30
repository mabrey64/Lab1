import java.util.Scanner;

/**
 * SafeInputObj is a class that is used to get input from the user in a safe manner
 * It uses a Scanner object to read the input
 *
 */

public class SafeInputObj
{

    private Scanner pipe;

    /**
     * The default constructor for the SafeInputObj class
     * It creates a new Scanner object to read the input
     */
    public SafeInputObj()
    {
        pipe = new Scanner(System.in);
    }

    /**
     * Constructor that takes a Scanner object as a parameter
     * @param  scanner - Scanner object to read the input
     */
    SafeInputObj(Scanner scanner)
    {
        pipe = scanner;
    }

    /**
     * Get a non-zero length string from the user
     * @param prompt - prompt that is displayed for the user
     * @return a non-zero length string
     */
    public String getNonZeroLenString( String prompt)
    {
        String retString = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        }while(retString.length() == 0); // until we have some characters

        return retString;

    }

    /**
     * Get an int value within a specified numeric range
     * @param prompt - input prompt msg should not include range info
     * @param low - low end of inclusive range
     * @param high - high end of inclusive range
     * @return - int value within the inclusive range
     */

    public int getRangedInt(String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]: ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("\nNumber is out of range [" + low + "-" + high + "]: " + retVal);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        }while(!done);

        return retVal;
    }

    /**
     * Get an int value with no constraints
     * @param prompt - input prompt msg should not include range info
     * @return - int value
     */
    public int getInt(String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        }while(!done);

        return retVal;
    }

    /**
     * Get a double value within a specified numeric range
     * @param prompt - input prompt msg should not include range info
     * @param low - low end of inclusive range
     * @param high - high end of inclusive range
     * @return - double value within the inclusive range
     */
    public double getRangedDouble(String prompt, int low, int high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]: ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("\nNumber is out of range [" + low + "-" + high + "]: " + retVal);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a double: " + trash);
            }
        }while(!done);

        return retVal;
    }

    /**
     * Get a double value with no constraints
     * @param prompt - input prompt msg should not include range info
     * @return - double value
     */
    public double getDouble(String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a double: " + trash);
            }
        }while(!done);

        return retVal;
    }

    /**
     * Get a yes or no confirmation from the user
     * @param prompt - input prompt msg should not include range info
     * @return - true if the user enters Y, false if the user enters N
     */
    public boolean getYNConfirm(String prompt)
    {
        boolean retVal = true;
        String response = "";
        boolean gotAVal = false;

        do
        {
            System.out.print("\n" + prompt + " [Y/N] ");
            response = pipe.nextLine();
            if(response.equalsIgnoreCase("Y"))
            {
                gotAVal = true;
                retVal = true;
            }
            else if(response.equalsIgnoreCase("N"))
            {
                gotAVal = true;
                retVal = false;
            }
            else
            {
                System.out.println("You must answere [Y/N]! " + response );
            }

        }while(!gotAVal);

        return retVal;
    }

    /**
     * Get a string that matches a regular expression pattern
     * @param prompt - input prompt msg should not include range info
     * @param regExPattern - regular expression pattern that the input must match
     * @return - a string that matches the regular expression pattern
     */
    public String getRegExString(String prompt, String regExPattern)
    {
        String response = "";
        boolean gotAVal = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if(response.matches(regExPattern))
            {
                gotAVal = true;
            }
            else
            {
                System.out.println("\n" + response + " must match the pattern " + regExPattern);
                System.out.println("Try again!");
            }

        }while(!gotAVal);

        return response;
    }
}
