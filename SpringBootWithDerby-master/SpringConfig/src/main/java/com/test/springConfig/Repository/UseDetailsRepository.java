package com.test.springConfig.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.springConfig.Entity.UserDetails;

public interface UseDetailsRepository extends JpaRepository<UserDetails, Long>{

}
