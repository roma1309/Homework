package com.company;
public class Manager extends Person {
    public double salaryCoefficient;
public double vocationCoefficient;
protected double day;

    public Manager(String name, String fullName, int number, String address, int salary, double salaryCoefficient, double vocationCoefficient, double day) {
        super(name, fullName, number, address, salary);
        this.salaryCoefficient = salaryCoefficient;
        this.vocationCoefficient = vocationCoefficient;
        this.day = day;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public double getVocationCoefficient() {
        return vocationCoefficient;
    }

    public void setVocationCoefficient(double vocationCoefficient) {
        this.vocationCoefficient = vocationCoefficient;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    @Override
    public double money() {
        return salaryCoefficient*salary;
    }

    @Override
    public double vocation() {
        return vocationCoefficient*day;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "salaryCoefficient=" + salaryCoefficient +
                ", salary="+money()+
                ", vocationCoefficient=" + vocationCoefficient +
                ", day=" + day +"="+vocation()+super.toString()+

                '}';
    }
}














