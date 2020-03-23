package com.company;

public class Main {

    public static void main(String[] args) {
        Person person= new Manager("Влад","Роналду",999,"Сурганова",1500,1.5,2,4) ;
        Person person1= new Manager("Рома","Месси",802,"Ленина",1000,1.4,4,6) ;
        Person person2= new Employee("Jek","Brown",3211,"London",200,23);
        Person[]a=new Person[3];
        a[0]=person;
        a[1]=person1;
        a[2]=person2;
        for(int i=0;i<3;i++){
            System.out.println(a[i]);
        }
    }
}
