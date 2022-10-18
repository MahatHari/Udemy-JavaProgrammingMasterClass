public class Challenge8 {
    public static void main(String[] args) {
        /*
        There are many interfaces in JavaSDK, and sometimes we can use
        a lambda expression instead of creating and instance that implements
        the interface we want to use.
        Given a specific interface, how can we tell whether we can map a lambda
        expression to it? Whats the criteria that has to be met?
        */
        /** Answer: The interface has to be a functional interface. It can have only a
         * single method that must be implemented.
         * */

        /*
        * With what in mind can we use lambda expression to represent and instance of the
        * java.util.concurrent.Callable interface?
        * */
        /** Ans: The Callable interface has only on method that has to be implemented - the call() method
         *  So we can use a lambda for it. The document also states that it's a functional interface.
         * */

        /* Question: Is the java.util.Comparator interface a functional Interface?
        * */
        /** Answer: Yes it is. Despite containing over 10 methods, only one method has to be
         *  implemented - compare(). Because of that, it's a functional interface
         * */
    }
}
