package dependency;

public class B {

    private A a;

    B(int num) {
        a = new A(num);
    }

    public void showA() {
        System.out.println(a.getNum());
    }
}
