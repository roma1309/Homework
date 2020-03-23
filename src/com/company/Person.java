package com.company;

public abstract class Person {
    public String name;
    public String fullName;
    public int number;
    public String address;
    public int salary;


    public Person(String name, String fullName, int number, String address, int salary) {
        this.name = name;
        this.fullName = fullName;
        this.number = number;
        this.address = address;
        this.salary = salary;
    }

    public abstract double money();

    public abstract double vocation();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", number=" + number +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}




