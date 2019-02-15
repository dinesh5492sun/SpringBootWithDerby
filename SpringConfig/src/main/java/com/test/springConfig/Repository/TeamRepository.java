package com.test.springConfig.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.springConfig.pojo.Team;


@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
    Team findById(long playerId);
}