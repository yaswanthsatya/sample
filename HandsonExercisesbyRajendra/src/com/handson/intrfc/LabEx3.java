package com.handson.intrfc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class LabEx3 {
     
    public static void main(String a[]){
         
        List<Empl> list = new ArrayList<Empl>();
        list.add(new Empl("Ram",2));
        list.add(new Empl("John",1));
        list.add(new Empl("Crish",3));
        list.add(new Empl("Tom",4));
        Collections.sort(list,new AthletGrade());
        System.out.println("Sorted list entries: ");
        for(Empl e:list){
            System.out.println(e);
        }
    }
}
 
class AthletGrade implements Comparator<Empl>{
 
    @Override
    public int compare(Empl e1, Empl e2) {
        if(e1.getGrade() < e2.getGrade()){
            return -1;
        } else {
            return 1;
        }
    }
}
 
class Empl{
     
    private String name;
    private int grade;
     
    public Empl(String n, int s){
        this.name = n;
        this.grade = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGrade() {
        return grade;
    }
    public void setSalary(int salary) {
        this.grade = grade;
    }
    public String toString(){
        return " "+this.name+"-- Grade: "+this.grade;
    }
}