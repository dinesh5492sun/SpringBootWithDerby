package com.test.springConfig.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.springConfig.Repository.PlayerRepository;
import com.test.springConfig.Repository.TeamRepository;
import com.test.springConfig.pojo.Player;
import com.test.springConfig.pojo.Team;



@Service
public class SoccerServiceImpl implements SoccerService {
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private TeamRepository teamRepository;
    public List<String> getAllTeamPlayers(long teamId) {
        List<String> result = new ArrayList<String>();
        List<Player> players = playerRepository.findByTeamId(teamId);
        for (Player player : players) {
            result.add(player.getName());
        }
        return result;
    }
    public void addBarcelonaPlayer(String name, String position, int number) {
        Team barcelona = teamRepository.findById(1l);
        Player newPlayer = new Player();
        newPlayer.setName(name);
        newPlayer.setPosition(position);
        newPlayer.setNum(number);
        newPlayer.setTeam(barcelona);
        playerRepository.save(newPlayer);
    }
}