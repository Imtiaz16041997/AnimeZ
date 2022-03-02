package com.imtiaz.animex.Model;

public class Saga {
    private int episode_from;
    private int episode_to;
    private int episodes_count;
    Titles titles;
    Descriptions descriptions;

    public int getEpisode_from() {
        return episode_from;
    }

    public void setEpisode_from(int episode_from) {
        this.episode_from = episode_from;
    }

    public int getEpisode_to() {
        return episode_to;
    }

    public void setEpisode_to(int episode_to) {
        this.episode_to = episode_to;
    }

    public int getEpisodes_count() {
        return episodes_count;
    }

    public void setEpisodes_count(int episodes_count) {
        this.episodes_count = episodes_count;
    }

    public Titles getTitles() {
        return titles;
    }

    public void setTitles(Titles titles) {
        this.titles = titles;
    }

    public Descriptions getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(Descriptions descriptions) {
        this.descriptions = descriptions;
    }
}
