import java.util.Scanner;
    abstract class Employee{
        private String name;
        private int empid;
        private double salary;
        Employee(String name,int empid,double salary){
            this.name=name;
            this.empid=empid;
            this.salary=salary;
        }
        public String getName(){
            return name;
        }
        public int getEmpid(){
            return empid;
        }
        public double getSalary(){
            return salary;
        }
public void setSalary(double salary){
    this.salary=salary;
}
abstract double calculateSalary();
void display(){
    System.out.println("Name:"+name+"ID:"+empid+"|Total Salary:"+calculateSalary());
}
    }
    class FullTimeEmployee extends Employee{
        private double bonus;
    FullTimeEmployee(String name,int empid,double salary,double bonus){


    }
    }
    
