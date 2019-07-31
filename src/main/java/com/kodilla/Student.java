package com.kodilla;
import java.util.*;
import java.lang.*;
import java.io.*;


class Student{

    String firstName;
    String lastName;
    int id;


    public Student(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

    }


    @Override
    public boolean equals(Object o){
        final Student e = (Student) o;
        return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName);
    }

    @Override
    public int hashCode(){
        //??
        return id;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }



}


class Grades{

    Double math;
    Double biology;
    Double english;
    Double chemistry;
    Double art;


    public Grades(Double math, Double biology, Double english, Double chemistry, Double art){
        this.math = math;
        this.biology = biology;
        this.english = english;
        this.chemistry = chemistry;
        this.art = art;


    }



    public Double getAverage(){
        double average = (math + biology + english + chemistry + art) / 5;
        return average;

    }

    @Override
    public String toString(){
        return getAverage().toString();
    }



}

class HashMapandGrades{
    public static void main(String[] args){

        Student student1 = new Student("Friday","McFood", 1);
        Student student2 = new Student("Willow","McWoof", 2);
        Student student3 = new Student("Frosting","McToy", 3);
        Student student4 = new Student("Noah","McBark", 4);

        Grades grad1 = new Grades(3.0, 4.5, 5.0, 4.0, 4.0);
        Grades grad2 = new Grades(5.0, 5.0, 4.5, 4.0, 4.5);
        Grades grad3 = new Grades(4.5, 4.5, 5.0, 4.5, 4.0);
        Grades grad4 = new Grades(3.5, 5.0, 4.5, 4.5, 3.5);

        HashMap<Student, Grades> gradesCalculator = new HashMap<Student, Grades>();

        gradesCalculator.put(student1, grad1);
        gradesCalculator.put(student2, grad2);
        gradesCalculator.put(student3, grad3);
        gradesCalculator.put(student4, grad4);


        for(Map.Entry<Student, Grades> entry: gradesCalculator.entrySet()){
            String key = entry.getKey().toString();
            System.out.println((key) + " " + " " + entry.getValue());

        }


    }

}