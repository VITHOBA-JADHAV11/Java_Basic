package com.vithu.copy_conts;

public class TaxCalculation {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Alice", 30000, 5000, 2000);
        Manager m = new Manager(2, "Bob", 40000, 6000, 3000, 10000);
        Trainer t = new Trainer(3, "Charlie", 35000, 4000, 2500, 4, 2000);
        Sourcing s = new Sourcing(4, "Diana", 32000, 4000, 1800, 100, 80, 50);

        System.out.println("Employee Gross Salary: " + e.calculateGrossSalary());
        System.out.println("Employee Tax: " + TaxUtil.calculateTax(e));

        System.out.println("Manager Gross Salary: " + m.calculateGrossSalary());
        System.out.println("Manager Tax: " + TaxUtil.calculateTax(m));

        System.out.println("Trainer Gross Salary: " + t.calculateGrossSalary());
        System.out.println("Trainer Tax: " + TaxUtil.calculateTax(t));

        System.out.println("Sourcing Gross Salary: " + s.calculateGrossSalary());
        System.out.println("Sourcing Tax: " + TaxUtil.calculateTax(s));
    }
}

