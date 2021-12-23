package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.mail.MailSander;
import edu.javacourse.studentorder.validator.ChildrenWalidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;
import edu.javacourse.studentorder.validator.StudentValidator;
import edu.javacourse.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {

    public static void main(String[] args) {checkAll();}

    static void checkAll() {

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

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostname = "Host1";
        AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        return ans1;
    }
    static AnswerWedding checkWedding(StudentOrder so) {
        WeddingValidator wd = new WeddingValidator();
        return wd.checkWedding(so);
    }
    static AnswerChildren checkChildren(StudentOrder so) {
        ChildrenWalidator cv = new ChildrenWalidator();
        return cv.checkChildren(so);
    }
    static AnswerStudent checkStudent(StudentOrder so) {
        return new StudentValidator().checkStudent(so);
    }

    static void sendMail(StudentOrder so) {
        new MailSander().sendMail(so);
    };
}
