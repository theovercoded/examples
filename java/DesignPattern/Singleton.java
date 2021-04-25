package DesignPatterns;

/**
 * A basic implementation of the Singleton pattern such
 * that only a single instance of the class may be
 * present in the application.
 */
public class Singleton {

    // A private static method that holds the
    // single instance of the Singleton, if
    // one has been instantiated anywhere.
    private static Singleton _instance = null;

    // A variable to hold a String message
    String message = "Hello, my name is Singleton.";

    /**
     * Getter method to return instance message
     * @return String - Message currently held by Singleton
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter method to change the current message
     * @param message String - value to change the message to.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Private constructor to prevent instantiation of
     * Single objects from anywhere other than this Class.
     */
    private Singleton(){}

    /**
     * Method to return the current instance of the Singleton
     * class if one has been instantiated or, if not, create
     * and return the new one.
     * @return Singleton - the single globally-accessible instance
     */
    public static Singleton getInstance(){
        if(_instance == null){
            _instance = new Singleton();
        }
        return _instance;
    }

    /**
     * A simple example driver to illustrate the basic operations of
     * the Single class.
     */
    public static void main(String[] args) {

        // Create a new Singleton object via static method
        Singleton singleton = Singleton.getInstance();

        // Print the message to standard output
        System.out.println(singleton.getMessage());

        // Create a new singleton object
        Singleton singletonTwo = Singleton.getInstance();

        // Create a unique message for the second Singleton
        singletonTwo.setMessage("Hello, my name is SingletonTwo");

        // Print the message of the second Singleton
        System.out.println(singletonTwo.getMessage());

        // Print the message of the first Singleton again (it changed!)
        System.out.println(singleton.getMessage());

    }
}
