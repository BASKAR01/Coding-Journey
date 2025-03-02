public class functiondemo
    {
        void greeting()
        {
            System.out.println("Vanakam");
            dummy();
        }
        void dummy()
        {
            System.out.println("I am Strong");
        }
        public static void main(String[] args)
        {
            functiondemo obj1 = new functiondemo();
            obj1.greeting();
        }
    }
