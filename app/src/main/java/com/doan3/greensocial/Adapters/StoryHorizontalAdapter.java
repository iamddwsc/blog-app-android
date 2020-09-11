package com.doan3.greensocial.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.doan3.greensocial.Models.StoryHorizontal;
import com.doan3.greensocial.Models.StoryImage;
import com.doan3.greensocial.Models.User;
import com.doan3.greensocial.R;

import java.util.ArrayList;

public class StoryHorizontalAdapter extends RecyclerView.Adapter<StoryHorizontalAdapter.StoryHorizontalHolder> {
    private ArrayList<StoryHorizontal> stories;
    private Context context;

    public StoryHorizontalAdapter(ArrayList<StoryHorizontal> stories, Context context) {
        this.stories = stories;
        this.context = context;
    }

    @NonNull
    @Override
    public StoryHorizontalHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_story_horizontal, parent, false);
        return new StoryHorizontalHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryHorizontalHolder holder, int position) {
        ArrayList<User> user_have_story = stories.get(position).getUsers();
        StorySingleAdapter storySingleAdapter = new StorySingleAdapter(user_have_story, context);
        holder.rvStoryHorizontal.setHasFixedSize(true);
        holder.rvStoryHorizontal.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.rvStoryHorizontal.setAdapter(storySingleAdapter);
        holder.rvStoryHorizontal.setNestedScrollingEnabled(false);
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    public class StoryHorizontalHolder extends RecyclerView.ViewHolder {
        private RecyclerView rvStoryHorizontal;
        public StoryHorizontalHolder(@NonNull View itemView) {
            super(itemView);
            rvStoryHorizontal = itemView.findViewById(R.id.rvStoryHorizontal);
        }
    }
}
