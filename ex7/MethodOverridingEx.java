package ex7;

abstract class Shape { // 슈퍼 클래스
    public Shape next;

    public Shape() {
        next = null;
    }

    public abstract void draw();
}

class Line extends Shape {
    @Override
    public void draw() { // 메소드 오버라이딩
        System.out.println("Line");
    }
}

class Circle extends Shape {
    @Override
    public void draw() { // 메소드 오버라이딩
        System.out.println("Circle");
    }
}

class Rect extends Shape {
    @Override
    public void draw() { // 메소드 오버라이딩
        System.out.println("Rect");
    }
}

public class MethodOverridingEx {
    public static void main(String args[]) {
        Shape start, last, obj;

        // 링크드 리스트로 도형 생성하여 연결
        start = new Line(); // Line 연결
        last = start;
        obj = new Rect();
        last.next = obj; // Rect 연결
        last = obj;
        obj = new Line(); // Line 연결
        last.next = obj;
        last = obj;
        obj = new Circle(); // Circle 연결
        last.next = obj;

        // 모든 도형 출력
        Shape p = start;
        while (p != null) {
            p.draw();
            p = p.next;
        }
    }

}