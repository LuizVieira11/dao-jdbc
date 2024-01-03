package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== TEST 1: department findById ====");
        Department dep = departmentDao.findById(2);
        System.out.println(dep);

        System.out.println("\n==== TEST 2: department findAll ====");
        List<Department> departments = departmentDao.findAll();
        for(Department d : departments){
            System.out.println(d);
        }

        System.out.println("\n==== TEST 3: department insert ====");
        Department newDepartment = new Department(null, "Crypto");
//        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n==== TEST 4: department update ====");
        dep = departmentDao.findById(1);
        dep.setName("PCs");
        departmentDao.update(dep);
        System.out.println("Update completed");

        System.out.println("\n==== TEST 5: department deletion ====");
//        departmentDao.deleteById(6);
        System.out.println("Delete Completed");

    }

}
