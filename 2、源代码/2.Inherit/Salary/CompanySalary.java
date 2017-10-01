package Salary;

abstract class Employee{
    public abstract double earnings();
}

class YearWorker extends Employee{
    @Override
    public double earnings() {
        return 15000;
    }
}

class MonthWorker extends Employee{
    @Override
    public double earnings() {
        return 12*1200;
    }
}

class WeekWorker extends Employee{
    @Override
    public double earnings() {
        return 52*300;
    }
}

class Company{

    Employee[] employees;
    double salaries=0;

    Company(Employee[] employee){
        employees=employee;
    }
    public double salariesPay(){
        salaries=0;
        for (int i=0; i<employees.length; i++){
            salaries+=employees[i].earnings();
        }
        return salaries;
    }
}

public class CompanySalary {
    public static void main(String[] args) {
        Employee[] employees=new Employee[29];
        for (int i=0; i<employees.length; i++){
            if (i%3==0) {
                employees[i]=new WeekWorker();
            }
            if (i%3==1){
                employees[i]=new MonthWorker();
            }
            if (i%3==2){
                employees[i]=new YearWorker();
            }
        }
        Company company=new Company(employees);
        System.out.println("公司的总薪水为"+company.salariesPay()+"元。");
    }
}
