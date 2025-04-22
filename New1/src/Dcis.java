public class Dcis {

    public static void main(String[] args) {

        
        Resources sharedResources = new Resources(100, 50);  

        
        Employee emp1 = new Employee("Alice", "Engineering", sharedResources);
        Employee emp2 = new Employee("Bob", "QA", sharedResources);
        Employee emp3 = new Employee("Charlie", "Engineering", sharedResources);
        Employee emp4 = new Employee("Daisy", "QA", sharedResources);
        Employee emp5 = new Employee("Ethan", "Engineering", sharedResources);

        
        System.out.println("----- Model Class Employee Details -----");
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
        emp4.displayEmployeeDetails();
        emp5.displayEmployeeDetails();
    }
}
