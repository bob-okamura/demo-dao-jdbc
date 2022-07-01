package application;

import java.text.ParseException;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		

		/*SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		
		System.out.println("*** TEST 1 - findById ***");
		System.out.println(seller);
		
		System.out.println("\n*** TEST 2 - findByDepartment ***");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n*** TEST 3 - findAll ***");
		list = sellerDao.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n*** TEST 4 - Seller insert ***");
		Seller newSeller = new Seller(null, "Evans", "evans@gmail.com", new Date(), 5000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted!! New Id = " + newSeller.getId());
		
		System.out.println("\n*** TEST 5 - Seller update ***");
		seller = sellerDao.findById(2);
		seller.setName("Bazinguinha");
		sellerDao.update(seller);
		System.out.println("Updated!! Check Id = " + seller.getId());
		
		System.out.println("\n*** TEST 6 - Seller delete ***");
		System.out.println("Select id to remove from database: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deleted id = " + id);
		
		sc.close();*/
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*System.out.println("\n*** TEST 1 DEPARTMENT findById ***");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n*** TEST 2 DEPARTMENT findAll ***");
		List<Department> list = departmentDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n*** TEST 3 DEPARTMENT insert ***");
		department.setName("Utilities");
		departmentDao.insert(department);
		
		System.out.println("Insert new id= " + department.getId());*/
		
		System.out.println("\n*** TEST 4 DEPARTMENT update ***");
		Department dep = new Department();
		dep = departmentDao.findById(6);
		dep.setName("XABLÁU");
		departmentDao.update(dep);
		
		System.out.println("Id atualizado: " + dep.getId());
		
		System.out.println("\n*** TEST 5 DEPARTMENT delete ***");
		departmentDao.deleteById(12);
		System.out.println("Deleted!!");
		
		}

}
