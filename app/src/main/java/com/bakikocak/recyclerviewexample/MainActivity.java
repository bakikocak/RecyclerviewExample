package com.bakikocak.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Team> teamList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new TeamAdapter(this,teamList);
        mRecyclerView = findViewById(R.id.rv_main);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        mRecyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }


    private void prepareMovieData() {

        Team team = new Team("Anderlecht", "BEL", "1908");
        teamList.add(team);

        team = new Team("APOEL", "CYP", "1926");
        teamList.add(team);

        team = new Team("Atlético Madrid", "ESP", "1903");
        teamList.add(team);

        team = new Team("Barcelona ", "ESP", "1899");
        teamList.add(team);

        team = new Team("Basel", "SUI", "1893");
        teamList.add(team);

        team = new Team("Bayern München", "GER", "1900");
        teamList.add(team);

        team = new Team("Benfica", "POR", "1904");
        teamList.add(team);

        team = new Team("Beşiktaş", "TUR", "1903");
        teamList.add(team);

        team = new Team("Celtic", "SCO", "1888");
        teamList.add(team);

        team = new Team("Chelsea", "ENG", "1905");
        teamList.add(team);

        team = new Team("CSKA Moskva", "RUS", "1923");
        teamList.add(team);

        team = new Team("Borussia Dortmund", "GER", "1909");
        teamList.add(team);

        team = new Team("Feyenoord", "NED", "1908");
        teamList.add(team);

        team = new Team("Juventus", "ITA", "1897");
        teamList.add(team);

        team = new Team("RB Leipzig", "GER", "2009");
        teamList.add(team);

        team = new Team("Liverpool", "ENG", "1892");
        teamList.add(team);

        team = new Team("Manchester City", "ENG", "1880");
        teamList.add(team);

        team = new Team("Manchester United", "ENG", "1878");
        teamList.add(team);

        team = new Team("Maribor", "SVN", "1960");
        teamList.add(team);

        team = new Team("Monaco", "FRA", "1924");
        teamList.add(team);

        team = new Team("Napoli", "ITA", "1926");
        teamList.add(team);

        team = new Team("Olympiacos", "GRE", "1925");
        teamList.add(team);

        team = new Team("Paris Saint-Germain", "FRA", "1970");
        teamList.add(team);

        team = new Team("Porto", "POR", "1893");
        teamList.add(team);

        team = new Team("Qarabağ", "AZE", "1950");
        teamList.add(team);

        team = new Team("Real Madrid", "ESP", "1902");
        teamList.add(team);

        team = new Team("Roma", "ITA", "1927");
        teamList.add(team);

        team = new Team("Sevilla", "ESP", "1905");
        teamList.add(team);

        team = new Team("Shakhtar Donetsk", "UKR", "1936");
        teamList.add(team);

        team = new Team("Spartak Moskva", "RUS", "1922");
        teamList.add(team);

        team = new Team("Sporting CP", "POR", "1906");
        teamList.add(team);

        team = new Team("Tottenham Hotspur", "ENG", "1882");
        teamList.add(team);

        mAdapter.notifyDataSetChanged();
    }
}
