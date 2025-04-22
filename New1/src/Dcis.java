public class Dcis {

    public static void main(String[] args) {

        
                Resources resources1 = new Resources(100, 50);  
                Resources resources2 = new Resources(120, 60);
                Resources resources3 = new Resources(90, 45);   
                Resources resources4 = new Resources(110, 55);  
                Resources resources5 = new Resources(95, 50);

        
                Employee emp1 = new Employee("Alice", "Engineering", resources1);
                Employee emp2 = new Employee("Bob", "QA", resources2);
                Employee emp3 = new Employee("Charlie", "Engineering", resources3);
                Employee emp4 = new Employee("Daisy", "QA", resources4);
                Employee emp5 = new Employee("Ethan", "Engineering", resources5);

        
        System.out.println("----- Employee Details -----");
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
        emp4.displayEmployeeDetails();
        emp5.displayEmployeeDetails();
    }
}
