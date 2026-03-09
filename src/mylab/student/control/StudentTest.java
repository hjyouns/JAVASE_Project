package mylab.student.control;

import mylab.student.entity.Student;
import mylab.student.exception.InvalidGradeException;

public class StudentTest {
    public static void main(String[] args) {
        // 1. 정상적인 학생 생성
        Student student = new Student("S001", "김민수", "컴퓨터공학", 3);
        System.out.println(student.toString());

        // 2. 학년 변경 시도 (정상)
        try {
            System.out.println("학년을 4학년으로 변경 시도");
            student.setGrade(4);
            System.out.println("변경 후: " + student);
        } catch (InvalidGradeException e) {
            System.out.println(e.getMessage());
        }

        // 3. 잘못된 학년 변경 시도 (오류 발생 케이스)
        try {
            System.out.println("\n5학년으로 변경 시도");
            student.setGrade(5); // 예외 발생 지점
        } catch (InvalidGradeException e) {
            // 출력 결과: "학년은 1~4 사이여야 합니다."
            System.out.println(e.getMessage());
        }
    }
}