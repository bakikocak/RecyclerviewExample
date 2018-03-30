package com.bakikocak.recyclerviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;

/**
 * Created by baki.kocak on 24/03/2018.
 */

class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {

    Context context;
    List<Team> teamList;

    public TeamAdapter(Context context, List<Team> teamList) {
        this.context = context;
        this.teamList = teamList;
    }


    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(R.layout.list_item_layout, parent, shouldAttachToParentImmediately);
        TeamViewHolder viewHolder = new TeamViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
        holder.teamTitleTextView.setText(teamList.get(position).getTitle());
        holder.leagueNameTextView.setText(teamList.get(position).getLeague());
        holder.yearTextView.setText(teamList.get(position).getYear());
    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }

    class TeamViewHolder extends RecyclerView.ViewHolder{

        TextView teamTitleTextView;
        TextView leagueNameTextView;
        TextView yearTextView;


        public TeamViewHolder(final View itemView) {
            super(itemView);

            teamTitleTextView = (TextView) itemView.findViewById(R.id.tv_team_title);
            leagueNameTextView = (TextView) itemView.findViewById(R.id.tv_league_name);
            yearTextView = (TextView) itemView.findViewById(R.id.tv_year_text);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, teamList.get(getAdapterPosition()).getTitle() + " is selected", Toast.LENGTH_SHORT).show();
                }
            });
        }

    }
}
