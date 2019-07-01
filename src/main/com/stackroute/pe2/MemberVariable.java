package com.stackroute.pe2;

 class Member {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private String name;
    private int age;
    private double salary;

    Member(String name,int age,double salary)
    {
        this.salary=salary;
        this.age=age;
        this.name=name;
    }
     Member(String name,int age)
     {

         this.age=age;
         this.name=name;
     }
     Member(String name)
     {
         this.name=name;
     }
}

public class MemberVariable

{
    public String printMemberVariable(String name,int age,double salary){

        StringBuilder stringBuilder=new StringBuilder();
        Member member=new Member(name,age,salary);
        stringBuilder=stringBuilder.append("Members Name: "+member.getName());
        stringBuilder=stringBuilder.append("\nMembers Age: "+member.getAge());
        stringBuilder=stringBuilder.append("\nMembers Salary: "+member.getSalary());

        return stringBuilder.toString();

}
    public String printMemberVariable(String name,int age){

        StringBuilder stringBuilder=new StringBuilder();
        Member member=new Member(name,age);
        stringBuilder=stringBuilder.append("Members Name: "+member.getName());
        stringBuilder=stringBuilder.append("\nMembers Age: "+member.getAge());
        stringBuilder=stringBuilder.append("\nMembers Salary: "+member.getSalary());

        return stringBuilder.toString();

    }
    public String printMemberVariable(String name){

        StringBuilder stringBuilder=new StringBuilder();
        Member member=new Member(name);
        stringBuilder=stringBuilder.append("Members Name: "+member.getName());
        stringBuilder=stringBuilder.append("\nMembers Age: "+member.getAge());
        stringBuilder=stringBuilder.append("\nMembers Salary: "+member.getSalary());

        return stringBuilder.toString();

    }

}
