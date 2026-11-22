
public class Lab6 {
    public static void main(String[] args) {
        Outer outer = new Outer();

        outer.display();

        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}

class Outer {
    void display() {
        System.out.println("Class is outer class");
    }

    class Inner {
        void display() {
            System.out.println("class is a inner class");
        }
    }
}
