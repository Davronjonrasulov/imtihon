package model;

import java.util.UUID;

public class Teacher {
    private UUID teacherid;
    private String teacherName;
    private String teacherSurname;
    private String teacherpassword;

    public Teacher() {
        this.teacherid=UUID.randomUUID();
    }

    public Teacher(String teacherName, String teacherSurname, String teacherpassword) {
       this();
        this.teacherName = teacherName;
        this.teacherSurname = teacherSurname;
        this.teacherpassword = teacherpassword;
    }

    public UUID getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(UUID teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSurname() {
        return teacherSurname;
    }

    public void setTeacherSurname(String teacherSurname) {
        this.teacherSurname = teacherSurname;
    }

    public String getTeacherpassword() {
        return teacherpassword;
    }

    public void setTeacherpassword(String teacherpassword) {
        this.teacherpassword = teacherpassword;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherid=" + teacherid +
                ", teacherName='" + teacherName + '\'' +
                ", teacherSurname='" + teacherSurname + '\'' +
                ", teacherpassword='" + teacherpassword + '\'' +
                '}';
    }
}
