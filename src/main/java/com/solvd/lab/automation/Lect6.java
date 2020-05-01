package com.solvd.lab.automation;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

interface Workable {
    void work();
}

class Employee implements Workable{
    private String name;
    private BigDecimal salary;

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void work() {

    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}

class Contractor extends Employee {
    private short contractLatency;

    public Contractor(String name, BigDecimal salary, short contractLatency) {
        super(name, salary);
        this.contractLatency = contractLatency;
    }

    public short getContractLatency() {
        return contractLatency;
    }

    public void setContractLatency(short contractLatency) {
        this.contractLatency = contractLatency;
    }

    @Override
    public void work() {
        System.out.println("Contractor");
    }
}

class Accountant extends Employee {

    private static final String SALARY_FIELD_NAME = "salary";

    public Accountant(String name, BigDecimal salary) {
        super(name, salary);
    }

    public BigDecimal getEmployeeSalary(Employee employee) {
        try {
            Class<?> employeeClass = employee.getClass();
            Field salaryField = employeeClass.getSuperclass().getDeclaredField(SALARY_FIELD_NAME);
            salaryField.setAccessible(true);
            return ((BigDecimal) salaryField.get(employee));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public void changeStone(Stone stone) {
        stone.setA(4);
    }
}

class HRM extends Employee {

    public HRM(String name, BigDecimal salary) {
        super(name, salary);
    }

    public List<String> getEmployeesData(List<Employee> employees) {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            try {
                String dataEntry = "";
                Class<?> employeeSuperClass = employees.get(i).getClass().getSuperclass();
                if (employeeSuperClass != null) {
                    for (Field f : employeeSuperClass.getDeclaredFields()) {
                        f.setAccessible(true);
                        data.add(String.join(dataEntry, f.get(employees.get(i)).toString()));
                        data.add(String.join(dataEntry, " "));

                    }
                }

                for (Field f : employees.get(i).getClass().getDeclaredFields()) {
                    f.setAccessible(true);
                    data.add(String.join(dataEntry, f.get(employees.get(i)).toString()));
                    data.add(String.join(dataEntry, " "));
                }
                data.add(dataEntry);
            } catch (IllegalAccessException e) {
                continue;
            }
        }
        return data;
    }
}

class Stone {
    private int a;

    public Stone(int a) {
        this.a = a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}

interface Transport {

    void move();

}

class Car implements Transport{
    public int a;

    public Car() {
        this.a = 2;
    }

    @Override
    public void move() {
        System.out.println("Car");
    }
}

class TruckCar implements Transport{
    public int a;

    public TruckCar() {
        this.a = 2;
    }

    @Override
    public void move() {
        System.out.println("Truck");
    }
}

class CarFactory {
    public static Transport createTransport(String name) {
        try {
            Class<?> transportClass = Class.forName(name);
            return (Transport) transportClass.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException();
        }

    }
}

public class Lect6 {
    public static void main(String[] args) {
        // create and manipulate with contractor
//        Contractor john = new Contractor("john", new BigDecimal(500), (short)6);
//        john.setSalary(new BigDecimal(2000));
//        System.out.println(john.getName());
//        System.out.println(john.getContractLatency());
//        john.work();
//
//        // get private field of john
//        Accountant allaSergeevna = new Accountant("alla sergeevna", new BigDecimal(2000));
//        BigDecimal johnsSalary = allaSergeevna.getEmployeeSalary(john);
//        System.out.println("Johns salary "+ johnsSalary);
//
//
//        // create list of Employees
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(john);
//        employeeList.add(allaSergeevna);
//
//        // get all data about a contractor and accountant (except salary)
//        HRM lera = new HRM("lera", new BigDecimal(2000));
//        List<String> info = lera.getEmployeesData(employeeList);
//        System.out.println(info);
//
//        // change stone
//        Stone s = new Stone(8);
//        System.out.println(s.getA());
//        allaSergeevna.changeStone(s);
//        System.out.println(s.getA());

        String c = "com.solvd.lab.automation.Car";
        Transport t = CarFactory.createTransport(c);
        t.move();


    }
}
