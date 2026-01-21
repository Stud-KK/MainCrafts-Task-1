package service;

import model.Employee;

import java.util.ArrayList;

public class EmployeeService {

     private ArrayList<Employee> list=new ArrayList<>();

      public void addEmployee(int id,String name,String department){

            Employee emp=new Employee(id,name,department);
            list.add(emp);
            System.out.println("employee added successfully");

      }
      public void updateEmployee(int id,String newDepartment){
          if(list.isEmpty()){
              System.out.println("list is empty");
              return;
          }
            for(Employee e:list){
                  if(e.getId()==id) {
                        e.setDepartment(newDepartment);
                        System.out.print("Department name updated successfully");
                        return;

                  }

                  }
            System.out.println("Invalid id ");
            }




      public void showEmployee(){
            if(list.isEmpty()){
                  System.out.println("Employees List is empty");
                  return;
            }
             for(Employee e:list){
                System.out.println("Employee :"+e.getId()+"Employee Name:"+e.getName()+"Employee Department"+
                        e.getDepartment());
             }
      }
      public void deleteEmployee(int id){
            for(Employee e:list){
                  if(e.getId()==id){
                        list.remove(e);
                        System.out.println("Employee Deleted Successfully");
                        return;
                  }
            }
            System.out.println("Employee Not found");
      }
}
