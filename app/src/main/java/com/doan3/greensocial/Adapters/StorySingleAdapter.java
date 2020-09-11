package com.doan3.greensocial.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.doan3.greensocial.Constant;
import com.doan3.greensocial.Models.StoryImage;
import com.doan3.greensocial.Models.User;
import com.doan3.greensocial.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class StorySingleAdapter extends RecyclerView.Adapter<StorySingleAdapter.StorySingleHolder> {
    private ArrayList<User> users;
    private Context context;

    public StorySingleAdapter(ArrayList<User> users, Context context) {
        this.users = users;
        this.context = context;
    }

    @NonNull
    @Override
    public StorySingleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.item_story_single, parent, false);
        return new StorySingleHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StorySingleHolder holder, int position) {
        holder.tvStoryName.setText(users.get(position).getUserName());
        Picasso.get().load(Constant.URL+"storage/profiles/"+users.get(position).getPhoto()).into(holder.civStoryImage);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class StorySingleHolder extends RecyclerView.ViewHolder {
        private CircleImageView civStoryImage;
        private TextView tvStoryName;
        public StorySingleHolder(@NonNull View itemView) {
            super(itemView);
            civStoryImage = itemView.findViewById(R.id.civStoryImage);
            tvStoryName = itemView.findViewById(R.id.tvStoryName);
        }
    }
}
