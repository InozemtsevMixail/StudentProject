package edu.javacourse.studentorder.domain.other;

import edu.javacourse.studentorder.domain.Person;

import java.time.LocalDate;

public class Adult extends Person
{
    private String passportSeriea;
    private String passportNumber;
    private LocalDate issueData;
    private String issueDepartment;
    private String university;
    private String studentId;

//    public String getPersonString() {
//        return  surName + " " + givenName + " " + passportNumber;
//    }

    public String getPassportSeriea() {
        return passportSeriea;
    }

    public void setPassportSeriea(String passportSeriea) {
        this.passportSeriea = passportSeriea;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getIssueData() {
        return issueData;
    }

    public void setIssueData(LocalDate issueData) {
        this.issueData = issueData;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
