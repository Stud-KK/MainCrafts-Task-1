package main;
import service.EmployeeService;

import java.util.*;
public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService empS = new EmployeeService();

        while (true) {
            System.out.println("1.Add employee");
            System.out.println("2.update employee Departmnt name:");
            System.out.println("3.view all emplyees");
            System.out.println("4.Delete employees");
            System.out.println("5.Exit");
            System.out.println("Enter the Step");

            int choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {
                case 1:
                    System.out.print("Enter employee Id");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter employee Name");
                    String name = sc.nextLine();
                    System.out.print("Employee Departmnt name");
                    String department = sc.nextLine();
                    empS.addEmployee(id, name, department);
                    break;


                case 2:
                    System.out.print("Enter the Id to update the department name");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter the new department Name");
                    String newName = sc.nextLine();
                    empS.updateEmployee(updateId, newName);
                    break;


                case 3:
                    empS.showEmployee();
                    break;

                case 4:
                    System.out.print("Enter the Employe Id to delete");
                    int newId = sc.nextInt();
                    empS.deleteEmployee(newId);
                    break;

                case 5:
                    System.out.println("Exiting application...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        }
    }
}