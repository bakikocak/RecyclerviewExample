package com.bakikocak.recyclerviewexample;

/**
 * Created by baki.kocak on 24/03/2018.
 */

public class Team {
    private String title, league, year;

    public Team() {
    }

    public Team(String title, String league, String year) {
        this.title = title;
        this.league = league;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
