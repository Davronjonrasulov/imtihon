package model;

import java.util.UUID;

public class Courses {

    private String coursName;
    private UUID coursId;
    private Double coursPrice;

    public Courses() {
        this.coursId=UUID.randomUUID();
    }

    public Courses(String coursName) {
        this();
        this.coursName = coursName;
    }

    public Courses(Double coursPrice) {
        this.coursPrice = coursPrice;
    }

    public String getCoursName() {
        return coursName;
    }

    public void setCoursName(String coursName) {
        this.coursName = coursName;
    }

    public UUID getCoursId() {
        return coursId;
    }

    public void setCoursId(UUID coursId) {
        this.coursId = coursId;
    }

    public Double getCoursPrice() {
        return coursPrice;
    }

    public void setCoursPrice(Double coursPrice) {
        this.coursPrice = coursPrice;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "coursName='" + coursName + '\'' +
                ", coursId=" + coursId +
                ", coursPrice=" + coursPrice +
                '}';
    }
}
