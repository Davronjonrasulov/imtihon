package model;

public class Journall {

    public String subject;
    public String sign;
    public String studentSurname;
    public String studentName;

    public Journall() {
    }

    public Journall(String subject, String sign, String studentSurname, String studentName) {
        this.subject = subject;
        this.sign = sign;
        this.studentSurname = studentSurname;
        this.studentName = studentName;
    }
}
