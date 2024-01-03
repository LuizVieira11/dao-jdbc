package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== TEST 1: department findById ====");
        Department dep = departmentDao.findById(2);
        System.out.println(dep);

        System.out.println("\n==== TEST 2: department findAll ====");

        System.out.println("\n==== TEST 3: department insert ====");

        System.out.println("\n==== TEST 4: department update ====");

        System.out.println("\n==== TEST 5: department deletion ====");


    }

}
