package com.test.springConfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.springConfig.Entity.BankAccount;
import com.test.springConfig.Entity.Cart1;
import com.test.springConfig.Entity.Items1;
import com.test.springConfig.Entity.Person;
import com.test.springConfig.Repository.Cart1Repository;
import com.test.springConfig.Repository.PersonRepository;
import com.test.springConfig.Repository.UseDetailsRepository;
import com.test.springConfig.service.SoccerService;

@SpringBootApplication
public class SpringConfigApplication implements CommandLineRunner {

	@Autowired(required = true)
	SoccerService soccerService;
	@Autowired(required = true)
	UseDetailsRepository useDetailsRepository;
	@Autowired(required = true)
	PersonRepository personRepository;
	@Autowired(required = true)
	Cart1Repository cart1Repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		Cart1 cart=new Cart1();
		Items1 it=new Items1();
		it.setItemId("1");
		it.setQuantity(1);
		it.setItemTotal(20);
		it.setCart1(cart);
		Items1 it1=new Items1();
		it1.setItemId("2");
		it1.setQuantity(2);
		it1.setItemTotal(30);
		it1.setCart1(cart);
		cart.setName("Dinesh");
		cart.setTotal(20);
		cart.setId(1);
		cart.getItems1().add(it);
		cart.getItems1().add(it1);
		cart1Repository.save(cart);
		
		
		//https://www.journaldev.com/2924/hibernate-one-to-many-mapping-annotation
		  Person per=new Person(); 
		  per.setName("Santosh");
		  BankAccount ba=new BankAccount(); 
		  ba.setBankName("BOM");
		  per.setParent(ba); 
		  personRepository.save(per); 
		  List<Person> person=personRepository.findAll();
		  System.out.println(person.toString());
		 // System.out.println("Person =>"+person.toString());
		 
		 		 

		/*
		 * OneToMany ReletionShip UserDetails ud=new UserDetails();
		 * ud.setUserName("Dinesh"); Vehicle ve=new Vehicle();
		 * ve.setVehicleName("Thunder Burd"); ud.setVehicle(ve);
		 * useDetailsRepository.save(ud); List<UserDetails>
		 * listOfUserDetails=useDetailsRepository.findAll();
		 * System.out.println(listOfUserDetails.toString());
		 */

		/*
		 * System.out.println("--------------------------------------------");
		 * soccerService.addBarcelonaPlayer("RealCricket", "Addactive", 6); List<String>
		 * players = soccerService.getAllTeamPlayers(1); for (String player : players) {
		 * System.out.println("Introducing Barca player => " + player); }
		 */
	}

}
