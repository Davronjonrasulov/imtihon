package service;

import model.Student;

public class StudentService {

    public Student[] studentList=new Student[100];
    private int index=0;

    public Student checkStudent(String studentName, String studentSurname)
    {
        for (Student student:studentList) {

                if(student !=null){
                    if(student.getStudentName().equals(studentName) &&
                    student.getStudentSurname().equals(studentSurname)
                    ){
                       return student;
                    }
                }
            }
            return null;
        }

        public boolean addStudent(String studentName, String studentSurname,String studentPassword,int studentAge ){
          if(checkStudent(studentName,studentSurname)==null){
              studentList[index++]=new Student(studentName,studentSurname,studentPassword,studentAge);
              return true;
          }
          return false;
        }

        public Student loginStudent(String studentName ,String studentSurname , String studentPassword ){
             Student student=checkStudent(studentName,studentSurname);
             if (student!=null){
                 if (student.getStudentpassword().equals(studentName)){
                     return student;
                 }
             }
             return null;
        }









}
