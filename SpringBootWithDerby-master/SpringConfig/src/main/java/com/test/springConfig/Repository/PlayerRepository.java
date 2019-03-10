package com.test.springConfig.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.springConfig.pojo.Player;


@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findByTeamId(long teamId);
}