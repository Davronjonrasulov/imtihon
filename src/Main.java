import model.Journall;
import model.Student;
import model.Teacher;
import service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scannerStr=new Scanner(System.in);
        Scanner scannerInt=new Scanner(System.in);

        BranchesService branchesService=new BranchesService();
        CoursesService coursesService=new CoursesService();
        GroupsService groupsService=new GroupsService();
        JournallService journallService=new JournallService();
        StudentService studentService=new StudentService();
        TeacherService teacherService=new TeacherService();
        int step=100;
        while(step!=0){
            System.out.println("1.Register Teacher " +"\n"+
                    "2.Register Student" +"\n"+
                    "3.Add Branche  " +"\n"+
                    "4.Add Cours " +"\n"+
                    "5.Add Group " +"\n"+
                    "6.Login Teacher " +"\n"+
                    "7.Login Student ");
            step=scannerInt.nextInt();
            switch (step){
                case 1-> {
                    System.out.println("Enter Name->");
                    String name = scannerStr.nextLine();
                    System.out.println("Enter Surname->");
                    String surname = scannerStr.nextLine();
                    System.out.println("Enter Password->");
                    String password = scannerStr.nextLine();

                    System.out.println(teacherService.addTeacher(name,surname,password));
                }
                case 2->{
                    System.out.println("Enter Name");
                    String name = scannerStr.nextLine();
                    System.out.println("Enter Surname");
                    String surname = scannerStr.nextLine();
                    System.out.println("Enter Password");
                    String password = scannerStr.nextLine();
                    System.out.println("enter age ->");
                    int age=scannerInt.nextInt();
                    System.out.println(studentService.addStudent(name, surname, password,age));
                }


                case 3->{
                    System.out.println("Enter Name->");
                    String name = scannerStr.nextLine();
                    System.out.println("Enter Address->");
                    String address = scannerStr.nextLine();
                    System.out.println("since ->");
                    int since=scannerInt.nextInt();
                    System.out.println(branchesService.addBranche(name,address,since));

                }

                case 4->{
                    System.out.println("Enter Name->");
                    String name = scannerStr.nextLine();

                    System.out.println("price->");
                    Double price=scannerInt.nextDouble();
                    System.out.println(coursesService.addCours(name,price));

                }

                case 5->{
                    System.out.println("Enter name->");
                    String name=scannerStr.nextLine();
                    System.out.println(groupsService.addGroup(name));
                }

                case 6->{
                    System.out.println("Enter Name");
                    String name = scannerStr.nextLine();
                    System.out.println("Enter Surname");
                    String surname = scannerStr.nextLine();
                    System.out.println("Enter Password");
                    String password = scannerStr.nextLine();
                    Teacher currentTeacher=teacherService.loginTeacher(name,surname,password);
                    if(currentTeacher==null){
                        System.out.println("ERROR !!!");
                    }else{
                        int step1=100;
                        while(step1!=0){
                            System.out.println("1. Attendance student 0.Exit");
                            step1=scannerInt.nextInt();
                            switch(step1){
                                case 1->{
                                    System.out.println("Subject ");
                                    String subject=scannerStr.nextLine();
                                    System.out.println("sign -> ");
                                    String sign=scannerStr.nextLine();
                                    System.out.println("Student Surname ->");
                                    String studentSurnam=scannerStr.nextLine();
                                    System.out.println("Student name-> ");
                                    String studentName=scannerStr.nextLine();
                                    System.out.println(journallService.addSign(subject,sign,studentSurnam,studentName));
                                }
                            }
                        }
                    }

                }
                case 7->{
                    System.out.println("Enter Name");
                    String name = scannerStr.nextLine();
                    System.out.println("Enter Surname");
                    String surname = scannerStr.nextLine();
                    System.out.println("Enter Password");
                    String password = scannerStr.nextLine();

                    Student currentStudent=studentService.loginStudent(name,surname,password);
                    if(currentStudent==null){
                        System.out.println("ERROR !!!");
                    }
                    else{
                        int step1=100;
                        while(step1!=0){
                            System.out.println("1.See my Attendance 0.Exit");
                            step1=scannerInt.nextInt();
                            switch (step1){
                                case 1->{
                                    for (Journall journall: journallService.journallList) {
                                          if (journall!=null){
                                              if(journall.studentSurname.equals(currentStudent.getStudentSurname())){
                                                  System.out.println("Subject-> "+journall.subject);
                                                  System.out.println("Sign ->"+journall.sign);
                                              }
                                          }
                                    }
                                }
                            }
                        }
                    }

                }


            }
        }

    }
}