package org.what.word.model;

import java.util.List;

public class LatestModel {
    String date;
    List<stories> stories;
    List<top_stories> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<stories> getStories() {
        return stories;
    }

    public void setStories(List<stories> stories) {
        this.stories = stories;
    }

    public List<org.what.word.model.top_stories> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<org.what.word.model.top_stories> top_stories) {
        this.top_stories = top_stories;
    }
}
