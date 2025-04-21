// 📦 POJO Class
class EmployeePOJO {
    private String name;
    private String department;

    public EmployeePOJO() {}

    public EmployeePOJO(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}

// 🪑 Resources Class - Furniture and Desktops
class Resources {
    private int numberOfDesktops;
    private int numberOfChairs;

    public Resources(int numberOfDesktops, int numberOfChairs) {
        this.numberOfDesktops = numberOfDesktops;
        this.numberOfChairs = numberOfChairs;
    }

    public int getNumberOfDesktops() {
        return numberOfDesktops;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }
}

// 👨‍💼 Model Class - Employee
class Employee {
    private String name;
    private String department;
    private Resources resources;

    public Employee(String name, String department, Resources resources) {
        this.name = name;
        this.department = department;
        this.resources = resources;
    }

    public void displayEmployeeDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Department: " + department);
        System.out.println("Desktops Available in Company: " + resources.getNumberOfDesktops());
        System.out.println("Chairs Available in Company: " + resources.getNumberOfChairs());
    }
}