package ex1;

public class Circle {
    // 필드
    public int radius;
    public String name;

    // 메소드
    public Circle() { // 매개 변수 없는 생성자
        // 필드 초기화
        radius = 1;
        name = "";
    }

    public Circle(int r) {
        radius = r;
    }

    public Circle(int r, String n) { // 매개 변수를 가진 생성자
        // 매개 변수로 필드 초기화
        radius = r;
        name = n;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String args[]) {
        Circle pizza = new Circle(10, "피자");

        double pizzaArea = pizza.getArea(); // 객체 접근
        System.out.println(pizza.name + "의 면적은" + pizzaArea);

        Circle donut = new Circle();

        donut.name = "도넛";
        double donutArea = donut.getArea();
        System.out.println(donut.name + "의 면적은" + donutArea);
    }
}