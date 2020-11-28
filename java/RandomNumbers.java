import java.util.Random;

public class RandomElements {

    /**
     * Given an array of integers, randomly selects an element.
     * @param numbers int[] collection
     * @return int value chosen at random
     */
    public static int RandomChoice(int[] numbers){
        return numbers[new Random().nextInt(numbers.length)];
    }

    /**
     * Fills an integer array with random numbers chosen within a specified range
     * of values.
     *
     * @param min minimum allowable value
     * @param max maximum allowable value (exclusive)
     * @param count number of random elements to generate
     * @return array of randomly-chosen integer values.
     */
    public static int[] RandomNumbers(int min, int max, int count){

        // Declare and initialize array
        int[] numbers = new int[count];

        // Instantiate a new random class object
        Random rand = new Random();

        // Generate <count> many random integers and add to array
        for (int i = 0; i < count; i++){
            numbers[i] = rand.nextInt(max-min) + min;
        }
        return numbers;
    }
}
