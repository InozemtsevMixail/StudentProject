package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.mail.MailSander;
import edu.javacourse.studentorder.validator.ChildrenValidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;
import edu.javacourse.studentorder.validator.StudentValidator;
import edu.javacourse.studentorder.validator.WeddingValidator;

public class StudentOrderValidator { //перечислили все валидаторы в сиде полей
    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSander mailSander;

    public  StudentOrderValidator() { //конструктор
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSander = new MailSander();
    }

    public static void main(String[] args) { //static - значит метод принадлежит не конкретному обьекту, а всему классу
        StudentOrderValidator sov = new StudentOrderValidator(); // создали обьект в который зашли через конструктор, внутри которого все присваивали
        sov.checkAll();}

    public void checkAll() {

        while (true) {
            StudentOrder so = readStudentOrder();
            if(so == null) {
                break;
            }

            AnswerCityRegister cityAnsver = checkCityRegister(so);
            if (!cityAnsver.success) {
                //
                // continue;
                break;
            }

            AnswerWedding wedAnsver = checkWedding(so);
            AnswerStudent studAnsver = checkStudent(so);
            AnswerChildren childAnswer = checkChildren(so);

            sendMail(so);
        }
    }

    public StudentOrder readStudentOrder() {
        SaveStudentOrder.buildStudentOrder();
        StudentOrder so = new StudentOrder();
        return so;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterVal.checkCityRegister(so);
    }
    public AnswerWedding checkWedding(StudentOrder so) {
        return weddingVal.checkWedding(so);
    }
    public AnswerChildren checkChildren(StudentOrder so) {
        return childrenVal.checkChildren(so);
    }
    public AnswerStudent checkStudent(StudentOrder so) {
        return studentVal.checkStudent(so);
    }
    public void sendMail(StudentOrder so) {
        mailSander.sendMail(so);
    };
}
