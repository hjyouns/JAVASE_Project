package mylab.library.control;

import mylab.library.entity.Book;

public class LibraryTest {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        // 1. 도서 등록
        myLibrary.addBook(new Book("자바의 정석", "남궁성", "978-89", 2016));
        myLibrary.addBook(new Book("스프링 입문", "최범균", "979-11", 2020));
        myLibrary.addBook(new Book("Clean Code", "Robert C. Martin", "978-01", 2008));

        // 2. 전체 목록 출력
        myLibrary.showAllBooks();

        // 3. 도서 검색 테스트
        myLibrary.searchByTitle("자바");
        myLibrary.searchByTitle("Python"); // 없는 도서 검색
    }
}