class Employee {
    public String name="Ram";
    public int empId=12345;
    public void Display(){
        System.out.println("The name of the Employee is "+name);
        System.out.println("The Employee id of the Employee is "+empId);
    }
    public static void main(String[] args){
        Employee e1 = new Employee();
        System.out.println("The details of an Employee is");
        e1.Display();
        Ex_Employee e2= new Ex_Employee();
        e2.DisplaySal();
    }
}
