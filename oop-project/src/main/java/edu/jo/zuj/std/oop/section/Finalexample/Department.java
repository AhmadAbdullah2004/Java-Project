package edu.std.oop.session.project.Finalexample;

public class Department extends Company {

    private String dname;
    private int empcount;

    public Department() {
        dname = "IT";
        empcount = 10;
    }

    public Department(String dname, int empcount) {
        setDname(dname);
        setEmpcount(empcount);
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        switch (dname) {
            case "IT":
            case "HR":
            case "Sales":

                this.dname = dname;

                break;
            default:
                this.dname = "IT";
        }

    }

    public int getEmpcount() {
        return empcount;
    }

    public void setEmpcount(int empcount) {
        switch (empcount) {
            case 5:
            case 10:
            case 20:
            case 40:
            case 60:
                this.empcount = empcount;
                break;
            default:
                this.empcount = 10;

        }

    }

    private double getDeptBudget() {
        switch (dname) {
            case "IT":
                return 2000;
            case "HR":
                return 1000;
            case "Sales":
                return 3000;
            default:
                return 1000;
        }

    }

    private double getEmpBudget() {
        switch (empcount) {
            case 5:
            case 10:
                return empcount * 1000;
            case 20:
            case 40:
                return empcount * 800;
            case 60:
                return empcount * 700;
            default:
                return empcount * 1000;
        }

    }

    public double getTotalBudget() {

        return ((getDeptBudget() + getEmpBudget())+1500);

    }

}
