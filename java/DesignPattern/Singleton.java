
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
}
