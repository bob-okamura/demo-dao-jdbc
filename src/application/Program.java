package application;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		
		System.out.println("*** TEST 1 - findById ***");
		System.out.println(seller);
		
		System.out.println("\n*** TEST 2 - findById ***");
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
		
		}

}
