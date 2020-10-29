package ex6;

class Person {
    String name;
    String id;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String grade;
    String department;

    public Student(String name) {
        super(name); // 명시적으로 슈퍼 클래스 생성자 지정 안할시에 오류
    }
}

public class UpCastingEx {
    public static void main(String args[]) {
        Student s = new Student("StudentA");
        Person p;

        p = s; // 업캐스팅. 명시적 타입변환 지정 없어도 됨.

        System.out.println(p.name); // 슈퍼클래스 멤버 접근 - 오류 없음
        // p.grade = "ABC" // 서브클래스 멤버 접근 - 오류
        // p.department = "ABCDE" // 서브클래스 멤버 접근 - 오류

        s = (Student) p; // 다운캐스팅. 명시적 타입변환 지정 필수.

        System.out.println(s.name); // 슈퍼클래스 멤버 접근 - 오류없음
        s.grade = "ABC"; // 서브클래스 멤버 접근 - 오류없음
    }
}
