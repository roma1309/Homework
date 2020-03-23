package com.company;
public class Employee extends Person{

    public  double fullDay;

    public Employee(String name, String fullName, int number, String address, int salary, double fullDay) {
        super(name, fullName, number, address, salary);

        this.fullDay = fullDay;
    }


    public double getFullDay() {
        return fullDay;
    }

    public void setFullDay(double fullDay) {
        this.fullDay = fullDay;
    }

    @Override
    public double money() {
        return salary;
    }

    @Override
    public double vocation() {
        return fullDay;
    }

    @Override
    public String toString() {
        return "Employee{" +money() +
                "and" + vocation() +super.toString()+
                '}';
    }
}




