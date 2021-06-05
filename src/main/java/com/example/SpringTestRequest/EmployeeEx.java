package com.example.SpringTestRequest;

public class EmployeeEx{
    public static  void main(String ar[]){
        Employee e= new Engineer();
    e.setGrade("10");
    e.setSalary(1000);
    e.label();

    }
}
  abstract  class Employee {
int salary;
String grade;

    abstract void setSalary(int salary);
    abstract  int getSalary();
    abstract  void setGrade(String grade);
    abstract  String getGrade();

    protected void label(){
        System.out.println("Employee Data:"+ salary +" "+grade);
    }
}

class  Engineer extends Employee {




    @Override
    void setSalary(int salary) {
this.salary=salary;
    }

    @Override
    int getSalary() {
        return salary;
    }

    @Override
    void setGrade(String grade) {
   this.grade=grade;
    }

    @Override
    String getGrade() {
        return grade;
    }
    public void label(){
        System.out.println("Employee Data:"+getGrade()+" "+getSalary());
    }

}


class Manager extends Employee {


    @Override
    void setSalary(int salary) {

    }

    @Override
    int getSalary() {
        return salary;
    }

    @Override
    void setGrade(String grade) {
grade=grade;
    }

    @Override
    String getGrade() {
        return grade;
    }
}

