package com.test.springConfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.test.springConfig.service.SoccerService;



@SpringBootApplication
public class SpringConfigApplication implements CommandLineRunner {

	@Autowired(required=true)
	SoccerService soccerService;

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("--------------------------------------------");
		soccerService.addBarcelonaPlayer("RealCricket", "Addactive", 6);
		List<String> players = soccerService.getAllTeamPlayers(1);
		for (String player : players) {
			System.out.println("Introducing Barca player => " + player);
		}
	}
	
	
}
