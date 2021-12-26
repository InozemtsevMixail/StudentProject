package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.other.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

import java.sql.SQLOutput;

public class SaveStudentOrder
{
    public static void main(String[] args) {

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
    static StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        husband.setGivenName("Захар");
        husband.setSurName("Лупов");
        husband.setPassportNumber("123456");
        so.setHusband(husband);

        String ans = husband.getPersonString();
        System.out.println(ans);

        return so;
    }
}
