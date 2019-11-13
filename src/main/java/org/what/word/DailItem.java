package org.what.word;

import java.util.List;

public class DailItem {
    private String date;
    private List<Item> item;
    private List<Item> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public List<Item> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<Item> top_stories) {
        this.top_stories = top_stories;
    }
}
