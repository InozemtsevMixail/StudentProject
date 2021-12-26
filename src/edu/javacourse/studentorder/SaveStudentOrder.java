package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

import java.sql.SQLOutput;

public class SaveStudentOrder //класс
{
    public static void main(String[] args) {  //метод
        buildStudentOrder();

//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);
    }
    static long saveStudentOrder(StudentOrder studentOrder) {
        long ansver;
        ansver = 199;
        System.out.println("saveStudentOrder:");

        return ansver;
    }
    public static StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder(); // new - создай обект, совпадает с именем класса

// создали обьект класса Adult и вызвали его конструктор, в данном случае без исполнения
        Adult husband = new Adult();

        Person p = new Person();
//        husband.setGivenName("Захар");
//        husband.setSurName("Лупов");
//        husband.setPassportNumber("123456");
//        so.setHusband(husband);

 //       String ans = husband.getPersonString();
   //     System.out.println(ans);

        return so;
    }
}
