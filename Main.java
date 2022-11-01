public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        customer.name = "Orlando";
        customer.age = 43;
        customer.phoneNumber = 55555555;
        customer.credit = 225.5;
        System.out.println("I'm " + customer.name + ", I have " + customer.age + "  years old and my phone number is " + customer.phoneNumber
                + " and my available credit is " + customer.credit + "$");

        employee.name = "Lina";
        employee.age = 32;
        employee.phoneNumber = 34567634;
        employee.salary = 4000.50;
        System.out.println("I'm " + employee.name + ", and I have " + employee.age + "years old and my phone number is " + employee.phoneNumber
                + " and my salary is " + employee.salary + "$");

    }
}

class People{
    int age;
    int phoneNumber;
    String name;
}

class Customer extends People{
    double credit;
}

class Employee extends People {
    double salary;
}