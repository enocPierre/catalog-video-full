package com.example.catalog.domain.entity;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class Video extends  BaseEntity {

    private String title;
    private String description;
    private Integer yearLanched;
    private  Boolean opened;
    private String rating;
    private Float duration;

    private List<Category> categories = new ArrayList<Category>();
    private List<Genre> genres = new ArrayList<Genre>();
    private List<CastMenber> castMenbers = new ArrayList<CastMenber>();

    public Video() {

    }

    public Video(UUID id, String title, String description, Integer yearLanched, Boolean opened) {
        super.setId(id);
        this.setTitle(title);
        this.setDescription(description);
        this.setYearLanched(yearLanched);
        this.setOpened(opened);
    }

    public Video(String title, String description, Integer yearLanched, Boolean opened) {
        super.generateUUID();
        this.setTitle(title);
        this.setDescription(description);
        this.setYearLanched(yearLanched);
        this.setOpened(opened);
    }

    public Video(String title, String description, Integer yearLanched, Boolean opened, String rating, Float duration) {
        super.generateUUID();
        this.setTitle(title);
        this.setDescription(description);
        this.setYearLanched(yearLanched);
        this.setOpened(opened);
        this.setRating(rating);
        this.setDuration(duration);
    }

    public Video(String title, String description, Integer yearLanched, Float duration) {
        super.generateUUID();
        this.setTitle(title);
        this.setDescription(description);
        this.setYearLanched(yearLanched);
        this.setDuration(duration);
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        if (title == null) throw new IllegalArgumentException("title is marked non-null but is null");
        if (title.length() == 0) throw  new IllegalArgumentException("title is marked non-blank but is blank");
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYearLanched() {
        return yearLanched;
    }

    public void setYearLanched(Integer yearLanched) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (yearLanched > currentYear ) throw new IllegalArgumentException("yearLaunched is greater tham current year");
        this.yearLanched = yearLanched;
    }

    public Boolean getOpened() {
        return opened;
    }

    public void setOpened(Boolean opened) {
        this.opened = opened;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        this.duration = Float.valueOf(decimalFormat.format(duration));
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        if (title == null) throw new IllegalArgumentException("categories is marked non-null but is null");
        this.categories = categories;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        if (genres == null) throw new IllegalArgumentException("genres is marked non-null but is null");
        this.genres = genres;
    }

    public List<CastMenber> getCastMenbers() {
        return castMenbers;
    }

    public void setCastMenbers(List<CastMenber> castMenbers) {
        if (castMenbers == null) throw new IllegalArgumentException("castMenber is marked non-null but is null");
        this.castMenbers = castMenbers;
    }

}
