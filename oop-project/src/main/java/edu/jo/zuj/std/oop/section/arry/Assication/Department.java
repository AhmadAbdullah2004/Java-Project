
package edu.std.oop.session.project.arry.Assication;


public class Department {
    private String name;
    private Employee[] employees;

    public Department() {
    }

    public Department(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployee() {
        return employees;
    }

    public void setEmployee(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" + "name=" + name + ", employees=" + employees + '}';
    }

   

   
}
