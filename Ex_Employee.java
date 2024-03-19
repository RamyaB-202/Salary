public class Ex_Employee extends Employee {
    private long Salary=56000;
    private int bonus=3000;
    public long Total_Sal;
    public void DisplaySal(){
         Total_Sal=Salary+bonus;
        System.out.println("Total Salary of the Employee is "+Total_Sal);
    }    
}