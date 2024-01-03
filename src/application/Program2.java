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

        System.out.println("==== TEST 1: seller findById ====");

        System.out.println("==== TEST 2: seller findAll ====");

        System.out.println("==== TEST 3: seller insert ====");

        System.out.println("==== TEST 4: seller update ====");

        System.out.println("==== TEST 5: seller deletion ====");


    }

}
