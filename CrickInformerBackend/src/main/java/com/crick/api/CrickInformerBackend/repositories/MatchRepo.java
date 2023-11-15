package com.crick.api.CrickInformerBackend.repositories;

import com.crick.api.CrickInformerBackend.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MatchRepo extends JpaRepository<Match,Integer> {
    //fetch the match by giving the team heading
    Optional<Match> findByTeamHeading(String teamHeading);
}
