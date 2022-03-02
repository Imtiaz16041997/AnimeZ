package com.imtiaz.animex.Model;

import java.util.ArrayList;
import java.util.List;

public class  Document{

    private int id;
    private int anilist_id;
    private int mal_id;
    private int tmdb_id;
    private int format;
    private int status;
    Titles titles;
    Descriptions descriptions;
    private ArrayList<String> genres;
    private String start_date;
    private String end_date;
    private int season_period;
    private int season_year;
    private int episodes_count;
    private int episode_duration;
    private int weekly_airing_day;
    private String trailer_url;
    private String cover_image;
    private String cover_color;
    private String banner_image;
    private int score;
    private boolean nsfw;
    private boolean hasCoverImage;
    private int sequel;
    private int prequel;
    private ArrayList<Saga> sagas;

    public int getWeekly_airing_day() {
        return weekly_airing_day;
    }

    public void setWeekly_airing_day(int weekly_airing_day) {
        this.weekly_airing_day = weekly_airing_day;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnilist_id() {
        return anilist_id;
    }

    public void setAnilist_id(int anilist_id) {
        this.anilist_id = anilist_id;
    }

    public int getMal_id() {
        return mal_id;
    }

    public void setMal_id(int mal_id) {
        this.mal_id = mal_id;
    }

    public int getTmdb_id() {
        return tmdb_id;
    }

    public void setTmdb_id(int tmdb_id) {
        this.tmdb_id = tmdb_id;
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public int getSeason_period() {
        return season_period;
    }

    public void setSeason_period(int season_period) {
        this.season_period = season_period;
    }

    public int getSeason_year() {
        return season_year;
    }

    public void setSeason_year(int season_year) {
        this.season_year = season_year;
    }

    public int getEpisodes_count() {
        return episodes_count;
    }

    public void setEpisodes_count(int episodes_count) {
        this.episodes_count = episodes_count;
    }

    public int getEpisode_duration() {
        return episode_duration;
    }

    public void setEpisode_duration(int episode_duration) {
        this.episode_duration = episode_duration;
    }

    public String getTrailer_url() {
        return trailer_url;
    }

    public void setTrailer_url(String trailer_url) {
        this.trailer_url = trailer_url;
    }

    public String getCover_image() {
        return cover_image;
    }

    public void setCover_image(String cover_image) {
        this.cover_image = cover_image;
    }

    public String getCover_color() {
        return cover_color;
    }

    public void setCover_color(String cover_color) {
        this.cover_color = cover_color;
    }

    public String getBanner_image() {
        return banner_image;
    }

    public void setBanner_image(String banner_image) {
        this.banner_image = banner_image;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isNsfw() {
        return nsfw;
    }

    public void setNsfw(boolean nsfw) {
        this.nsfw = nsfw;
    }

    public boolean isHasCoverImage() {
        return hasCoverImage;
    }

    public void setHasCoverImage(boolean hasCoverImage) {
        this.hasCoverImage = hasCoverImage;
    }

    public int getSequel() {
        return sequel;
    }

    public void setSequel(int sequel) {
        this.sequel = sequel;
    }

    public int getPrequel() {
        return prequel;
    }

    public void setPrequel(int prequel) {
        this.prequel = prequel;
    }

    public ArrayList<Saga> getSagas() {
        return sagas;
    }

    public void setSagas(ArrayList<Saga> sagas) {
        this.sagas = sagas;
    }
}
