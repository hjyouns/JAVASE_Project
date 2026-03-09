package mylab.student.entity;

import mylab.student.exception.InvalidGradeException;

public class Student {
    // 1. 모든 필드는 private으로 선언 (캡슐화)
    private String studentId;
    private String name;
    private String major;
    private int grade;

    public Student() {}

    public Student(String studentId, String name, String major, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    // 2. Getter와 Setter로 작성
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public int getGrade() { return grade; }

    // 3. 학년 설정 시 범위 체크 (1~4학년만 허용)
    public void setGrade(int grade) throws InvalidGradeException {
        if (grade >= 1 && grade <= 4) {
            this.grade = grade;
        } else {
            // 범위를 벗어날 경우 예외 발생
            throw new InvalidGradeException("학년은 1~4 사이여야 합니다.");
        }
    }

    
    @Override
    public String toString() {
        return name + " / " + major + " / " + grade + "학년";
    }
}