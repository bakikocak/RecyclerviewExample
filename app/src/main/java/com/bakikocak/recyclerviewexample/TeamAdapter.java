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

//Basic adapter creation extending from RecyclerView.Adapter and then specifying the custom ViewHolder called TeamViewHolder
public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {
    //Let's store context and a list of Team objects
    Context context;
    List<Team> teamList;

    // Pass in the team list & context into the constructor
    public TeamAdapter(Context context, List<Team> teamList) {
        this.context = context;
        this.teamList = teamList;
    }


    // Inflates custom layout for a RecyclerView item and returns the viewHolder
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(R.layout.list_item_layout, parent, shouldAttachToParentImmediately);
        TeamViewHolder viewHolder = new TeamViewHolder(view);
        return viewHolder;
    }

    // Populates data into the item through holder
    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
        holder.teamTitleTextView.setText(teamList.get(position).getTitle());
        holder.leagueNameTextView.setText(teamList.get(position).getLeague());
        holder.yearTextView.setText(teamList.get(position).getYear());
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return teamList.size();
    }

    //ViewHolder that gives us direct access to each view.
    class TeamViewHolder extends RecyclerView.ViewHolder{
        //Member views accesed via ViewHolder
        TextView teamTitleTextView;
        TextView leagueNameTextView;
        TextView yearTextView;


        public TeamViewHolder(final View itemView) {
            super(itemView);

            teamTitleTextView = (TextView) itemView.findViewById(R.id.tv_team_title);
            leagueNameTextView = (TextView) itemView.findViewById(R.id.tv_league_name);
            yearTextView = (TextView) itemView.findViewById(R.id.tv_year_text);

            //OnClickListener triggered when a view clicked on RecyclerView
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, teamList.get(getAdapterPosition()).getTitle() + " is selected", Toast.LENGTH_SHORT).show();
                }
            });
        }

    }
}