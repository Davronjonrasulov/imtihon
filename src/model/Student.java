package model;

import java.util.UUID;

public class Student {

     private UUID studentid;
      private String studentName;
      private String studentSurname;
      private String studentpassword;
      private int studentAge;

    public Student() {
        this.studentid=UUID.randomUUID();
    }

    public Student(String studentName, String studentSurname, String studentpassword, int studentAge) {
        this();
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentpassword = studentpassword;
        this.studentAge = studentAge;
    }

    public UUID getStudentid() {
        return studentid;
    }

    public void setStudentid(UUID studentid) {
        this.studentid = studentid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getStudentpassword() {
        return studentpassword;
    }

    public void setStudentpassword(String studentpassword) {
        this.studentpassword = studentpassword;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", studentpassword='" + studentpassword + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }
}
