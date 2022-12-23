package service;

import model.Courses;

public class CoursesService {

    public Courses[] courseList=new Courses[100];
    private  int index=0;

    public Courses checkCoures(String coursName){
        for (Courses courses : courseList) {
            if(courses !=null){
                if (courses.getCoursName().equals(coursName)){
                    return courses;
                }
            }
       }
        return null;
    }
      public boolean addCours(String coursName,Double price){
     if (checkCoures(coursName)==null){
         courseList[index++]=new Courses(coursName);
         return true;
     }
     return false;
      }



}
