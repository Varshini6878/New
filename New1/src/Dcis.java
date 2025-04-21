public class Dcis {

    public static void main(String[] args) {

        // Create resources
        Resources sharedResources = new Resources(100, 50);  // 100 desktops, 50 chairs

        // Create employee objects using Model class
        Employee emp1 = new Employee("Alice", "Engineering", sharedResources);
        Employee emp2 = new Employee("Bob", "QA", sharedResources);
        Employee emp3 = new Employee("Charlie", "Engineering", sharedResources);
        Employee emp4 = new Employee("Daisy", "QA", sharedResources);
        Employee emp5 = new Employee("Ethan", "Engineering", sharedResources);

        // Display model class employee info
        System.out.println("----- Model Class Employee Details -----");
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
        emp4.displayEmployeeDetails();
        emp5.displayEmployeeDetails();

        // Create POJO employee object
        EmployeePOJO empPojo = new EmployeePOJO("Alice", "Engineering");
        System.out.println("\n----- POJO Class Employee -----");
        System.out.println("Name: " + empPojo.getName());
        System.out.println("Department: " + empPojo.getDepartment());
    }
}