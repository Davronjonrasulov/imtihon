package service;

import model.Student;
import model.Teacher;

public class TeacherService {
    public Teacher[] teacherList =new Teacher[100];
    private int index=0;

    public Teacher checkTeacher(String TeacherName, String TeacherSurname){
        for (Teacher teacher: teacherList) {
            if(teacher != null){
                if(teacher.getTeacherName().equals(TeacherName) && teacher.getTeacherSurname().equals(TeacherSurname)){
                    return teacher;
                }
            }
        }
        return null;
    }
    public boolean addTeacher(String teacherName, String teacherSurname, String teacherPassword){
        if(checkTeacher(teacherName, teacherSurname) == null){
            teacherList[index++]=new Teacher(teacherName,teacherSurname,teacherPassword);
            return true;
        }
        return false;
    }
    public Teacher loginTeacher(String teacherName, String teacherSurname, String teacherPassword){
        Teacher teacher = checkTeacher(teacherName, teacherSurname);
        if(teacher != null){
            if(teacher.getTeacherpassword().equals(teacherPassword)){
                return teacher;
            }
        }
        return null;
    }

}
