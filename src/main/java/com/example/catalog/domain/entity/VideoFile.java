package com.example.catalog.domain.entity;

import java.text.DecimalFormat;

public class VideoFile extends  BaseEntity {
    private String title;
    private Float duration;
    private String Url;

    public VideoFile() {

    }

    public VideoFile(String title, Float duration, String url) {
        this.setTitle(title);
        this.setDuration(duration);
        this.setUrl(url);
    }

    public VideoFile(String title, Float duration) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        this.duration = Float.valueOf(decimalFormat.format(duration));
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

    public Float getDuration() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        this.duration = Float.valueOf(decimalFormat.format(duration));
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
