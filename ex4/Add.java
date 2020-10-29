package ex4;

public class Add {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        Add example = new Add();

        int i = example.add(1, 2);
        int j = example.add(1, 2, 3);
        double k = example.add(3.5, 5.5);

        System.out.println(i + " " + j + " " + k);
    }
}
