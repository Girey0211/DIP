package injection;

public class Injection {
    public static void main(String[] args) {
        A a = new A(10);
        B b = new B(a);
        b.showA();
    }
}
