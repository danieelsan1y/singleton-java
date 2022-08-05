import one.digitalinnovation.SingletonLazyHolder;

public class Program {
    public static void main(String[] args) {

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

    }
}
