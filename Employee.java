public class Employee {
    private String name;
    private double salary,raise;
    public Employee(String emp_name,double currentsalary)
    {
        name = emp_name;
        salary = currentsalary;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public void RSalary(double byPercent)
    {
        raise =((salary * byPercent)/100);
        salary=salary+raise;
    }
}
