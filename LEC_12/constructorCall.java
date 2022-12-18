class Hero {
    // Hero() {
    // System.out.println("I am a Hero");
    // }
    int a, b;

    Hero(int x, int y) {
        System.out.println("=>I am a Hero<=");
        a = x;
        b = y;
    }

    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }

    int mul() {
        return a * b;
    }

    int div() {
        return a / b;
    }
}

public class constructorCall {
    public static void main(String[] args) {

        Hero h = new Hero(1, 2);
        System.out.println(h.add());
        System.out.println(h.mul());
        System.out.println(h.div());
        System.out.println(h.sub());

    }
}
