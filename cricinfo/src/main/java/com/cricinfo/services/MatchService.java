package com.cricinfo.services;

import com.cricinfo.model.Match;
import java.util.*;

public interface MatchService {
    List<Match> getLiveMatchScores();
    List<List<String>> getCWC2023PointTable();
    List<Match> getAllMatches();

    List<List<String>> getIPL2024PointTable();
}
