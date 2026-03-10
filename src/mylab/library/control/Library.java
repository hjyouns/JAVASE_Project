package mylab.library.control;

import mylab.library.entity.Book;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books; // 도서 목록을 저장할 리스트

    public Library() {
        this.books = new ArrayList<>();
    }

    // 도서 추가 메서드
    public void addBook(Book book) {
        books.add(book);
    }

    // 제목으로 도서 검색 (부분 일치 포함)
    public void searchByTitle(String title) {
        System.out.println("\n--- '" + title + "' 검색 결과 ---");
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("해당 제목의 도서를 찾을 수 없습니다.");
        }
    }

    // 모든 도서 목록 출력
    public void showAllBooks() {
        System.out.println("\n--- 도서관 전체 장서 목록 ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}