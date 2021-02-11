public class Example {
    static class A {
        int x;
    }
    static class B extends A {}

    static <U> U genericMethod(U param) {
        int i = param.x; // compile time error
        System.out.println(param.getClass()); // prints B
        return param;
    }

    public static void main(String... args) {
        A var1 = new B();
        A var2 = genericMethod(var1);
        B var3 = genericMethod(var1); // compile time error
    }
}