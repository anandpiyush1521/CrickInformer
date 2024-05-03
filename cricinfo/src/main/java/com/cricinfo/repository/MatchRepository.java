package com.cricinfo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricinfo.model.Match;

public interface MatchRepository extends JpaRepository<Match, Integer> {
    //trying to fetch the match
    //by using team name
    Optional<Match> findByTeamHeading(String teamHeading);
}
