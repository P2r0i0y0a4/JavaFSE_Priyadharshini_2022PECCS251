package advanceTest4;

public class ExceptionThrower {

    /**
     * Throws a specific type of exception based on the input code.
     * @param type An integer code to determine which exception to throw:
     * 1 for IllegalArgumentException
     * 2 for IndexOutOfBoundsException
     * Any other value for a generic RuntimeException
     * @throws IllegalArgumentException if type is 1
     * @throws IndexOutOfBoundsException if type is 2
     * @throws RuntimeException for any other type
     */
    public void throwException(int type) {
        if (type == 1) {
            throw new IllegalArgumentException("Invalid argument provided!");
        } else if (type == 2) {
            throw new IndexOutOfBoundsException("Index is out of bounds!");
        } else {
            throw new RuntimeException("A generic runtime error occurred!");
        }
    }

    /**
     * This method will always throw a NullPointerException.
     * Useful for demonstrating expected NullPointerException.
     */
    public void throwNullPointerException() {
        String s = null;
        s.length(); // This will throw a NullPointerException
    }
}