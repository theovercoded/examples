package StateArticle;

/**
 * A class to demonstrate the difference in functional and imperative I/O
 * illustrating the concept of State.
 */
public class Stateful {

    // Declare a magic value
    int magicNumber;

    /**
     * Basic constructor requiring an integer to be used as the magic number.
     * @param a int - value to be used as the object's magic number.
     */
    public Stateful(int a){
        this.magicNumber = a;
    }

    /**
     * Returns the current value used as the objects magic number
     * @return int - an integer value
     */
    public int getMagicNumber() {
        return magicNumber;
    }

    /**
     * Updates the current value used as the object's magic number
     * @param magicNumber int - the value to use during update.
     */
    public void setMagicNumber(int magicNumber) {
        this.magicNumber = magicNumber;
    }

    /**
     * A simple function that calculates the sum of two integer values.
     * @param a int - the first integer
     * @param b int - the second integer
     * @return int - the sum of a and b, as an integer.
     */
    public static int addIntegers(int a, int b){
        return a + b;
    }

    /**
     * A simple function that calculates the sum of two integers and
     * the current value used by the object as its magic number.
     * @param a int - the first integer
     * @param b int - the second integer
     * @return int - the sum of a + b + magicNumber, as an integer.
     */
    public int addIntegersStatefully(int a, int b){
        return a + b + getMagicNumber();
    }

/**
 * Driver class to illustrate the functionality of Stateful, its methods,
 * and how they represent a non-Stateful (functional) and Stateful (imperative)
 * design.
 */
public static void main(String[] args) {

    // Define our integers
    int a = 6;
    int b = 9;

    // Announce current integer values
    System.out.println("Value of a = " + a);
    System.out.println("Value of b = " + b);


    // Test functional method
    // Note use of static method here.
    System.out.println("a + b = " + Stateful.addIntegers(a, b));

    // Test imperative method
    // Note use of object instantiation here, with specified magic number.
    Stateful stateObject = new Stateful(3);
    System.out.println("Current Magic Number = " + stateObject.getMagicNumber());
    System.out.println("a + b = " + stateObject.addIntegersStatefully(a, b));

    // Change the magic number
    stateObject.setMagicNumber(6);
    System.out.println("Current Magic Number = " + stateObject.getMagicNumber());

    // Test functional method again
    System.out.println("a + b = " + Stateful.addIntegers(a, b));

    // Test imperative method again
    System.out.println("a + b = " + stateObject.addIntegersStatefully(a, b));
    }
}
