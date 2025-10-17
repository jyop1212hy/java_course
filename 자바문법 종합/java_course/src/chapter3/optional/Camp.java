package chapter3.optional;

import java.util.Optional;

public class Camp {
    //속성
    private Student student;

    //생성자
    //기능 ⚠ null 을 반환할 수 있는 메서드
    public Optional<Student> getStudent() {
       return Optional.ofNullable(student);
        //        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
