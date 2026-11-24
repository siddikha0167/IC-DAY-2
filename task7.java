public class task7 {
    public static void main(String[] args) {
        SalesEmployee s=new SalesEmployee();
        s.baseSalary=2000.0;
        s.bonus=1000.0;
        System.out.println("Total Salary:"+s.calculateSalary());

    }
}
class Employee{
    double baseSalary;
    double calculateSalary(){
        return baseSalary;
    }
}
class SalesEmployee extends Employee{
    double bonus;
    @Override 
    double calculateSalary(){
        return super.calculateSalary()+bonus;
    }
}
