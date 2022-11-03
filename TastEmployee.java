public class TastEmployee {
    public static void main(String[] args) {
        Employee emp =new Employee("Bushra",2000);
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        emp.RSalary(20);
        System.out.println(emp.getSalary());


    }
}
