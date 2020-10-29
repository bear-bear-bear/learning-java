package ex2;

public class Book {
    String title;
    String author;

    void show() {
        System.out.println("[" + title + "]" + ": " + "'" + author + "'");
    }

    public Book() {
        this("", "");

        // this() – 클래스 내에서 생성자가 다른 생성자를 호출할 때 사용하는 자바 코드.
        //
        // **사용시 주의할 점**
        // 1. this()는 반드시 생성자 코드에서만 호출할 수 있음.
        // 2. this()는 반드시 같은 클래스 내 다른 생성자를 호출할 때 사용.
        // 3. this()는 반드시 생성자의 첫 번째 문장이 되어야 함.

        System.out.println("생성자 호출됨");
    }

    public Book(String title) {
        this(title, "작자미상");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String args[]) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");
        Book emptyBook = new Book();

        littlePrince.show();
        loveStory.show();
        emptyBook.show();
    }
}
