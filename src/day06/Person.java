package day06;

import java.util.Date;

public class Person {

    private Long id;
    private String firsName;
    private String lastName;
    private Double salary;
    private Date dob;
    
    public Person(Long id, String firsName, String lastName, Double salary, Date dob) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
        this.salary = salary;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", firsName=" + firsName + ", lastName=" + lastName + ", salary=" + salary
                + ", dob=" + dob + "]";
    }
    
}
