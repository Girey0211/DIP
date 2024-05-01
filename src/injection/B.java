package injection;

public class B {

    private A a;

    public B(A a) {
        this.a = a;
    }

    public void showA() {
        System.out.println(a.getNum());
    }
}
