
  package com.test.springConfig.Repository;
  
  import org.springframework.data.jpa.repository.JpaRepository;
  
  import com.test.springConfig.Entity.Person;
  
  public interface PersonRepository extends JpaRepository<Person, Long> {
  
  }
 