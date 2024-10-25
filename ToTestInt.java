// Define the Test interface
interface Test {
    int square(int num);
}

// Implement the Test interface in the Arithmetic class
class Arithmetic implements Test {
    @Override
    public int square(int num) {
        return num * num;
    }
}

// Create a new class called ToTestInt
class ToTestInt {
    public static void main(String[] args) {
        // Create an object of the Arithmetic class
        Arithmetic arithmetic = new Arithmetic();
        
        // Use the object of the Arithmetic class to call the square method
        int result = arithmetic.square(5);
        System.out.println("Square of 5 is: " + result);
    }
}
