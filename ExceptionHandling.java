import java.util.Arrays;
public class DifferentTypesofExceptions {
    public static void main(String[] args) {
        // 4. Null Pointer Exception  -  Run Time Exception
        String[] names = new String[10];
        System.out.println(Arrays.toString(names));
        System.out.println(names[0].charAt(1));  // Accessing from a null reference

        // 3. IndexOutOfBoundsException  -  Run Time Exception
        int[] arr = {10,20,30};
        System.out.println(arr[3]);  // no 3rd index in arr
        String name = "aditya";
        System.out.println(name.charAt(6)); // no 6th index in string

        // 2. NumberFormat Exception  -  Run Time Exception
        String x = "123z45";
        int ans = Integer.parseInt(x);
        System.out.println(ans * ans);

        // 1. Arithmetic Exception   -   Run Time Exception
        // Division by 0
        int a = 10;
        int b = 0;
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a + b);

        /* Keywords used in Exception handling
         *  -- try, catch, finally, throw, throws
         * there are two types of exception
         *  -- Checked - checked by java during compile time
         *  -- Unchecked - not checked during complie time and checked in run time
         * try keyword
         *  -- used to hold the block of code that can potentially throw exceptions
         * catch keyword
         *  -- used to catch the exception thrown by try block and handle it
         * finally keyword
         *  -- block used to place the code that has to execute, irrespective of 
         *       happening / handling of exceptions
         *      clean up actions : closing an opened file, closing a data base connection
         * throw keyword
         *  -- used to throw a new exception from a block of code
         * thorws keyword
         *  -- can be attached with methods / constructors to throw the exceptions
         *        to the callers without handling them in the method / constructor
         */

    }
}
