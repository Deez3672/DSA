public class FindFactorial{
    //method to find the factorial
    public static int factorial (int n) {  //long
            if (n == 1)
                return 1;
            else
                return n * factorial(n - 1);
        }
        public static void main(String[] args) {
            //long result = factorial(50);
            //System.out.println("Factorial is" + result);
            int myNum = 127 + 2;
        System.out.println("My number is "+ myNum );
    }
}