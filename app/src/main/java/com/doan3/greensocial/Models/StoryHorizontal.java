package com.doan3.greensocial.Models;

import java.util.ArrayList;

public class StoryHorizontal {
    private ArrayList<StoryImage> storyImages;
    private ArrayList<User> users;

    public StoryHorizontal (){

    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<StoryImage> getStoryImages() {
        return storyImages;
    }

    public void setStoryImages(ArrayList<StoryImage> storyImages) {
        this.storyImages = storyImages;
    }
}
