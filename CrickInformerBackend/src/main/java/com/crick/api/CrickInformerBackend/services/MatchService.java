package com.crick.api.CrickInformerBackend.services;

import com.crick.api.CrickInformerBackend.entities.Match;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface MatchService {
    //Get all matches
    List<Match> getAllMatches();

    //Get live matches
    List<Match>getLiveMatch();

    //Get cwc2023 point table

    List<List<String>> getCWC2023PointTable();
}
