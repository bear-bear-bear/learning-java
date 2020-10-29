package ex3;

import ex1.Circle;

public class CircleArray {
    public static void main(String args[]) {
        Circle[] c = new Circle[5]; // Circle 배열에 대한 레퍼런스 c 선언 + 5개의 레퍼런스 배열 생성

        for (int i = 0; i < c.length; i++) { // 배열의 개수만큼
            c[i] = new Circle(i); // i 번째 원소 객체 생성
        }

        for (int i = 0; i < c.length; i++) { // 배열의 모든 Circle 객체 면적 출력
            System.out.print((int) (c[i].getArea()) + " "); // (int) > 형변환
        }
    }
}