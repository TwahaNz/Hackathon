package com.ottobots.domain;

/**
 * Created by jamtah01 on 10/6/2016.
 */


public class Feature {


    private String id;
    private String name;
    private String url;
    private int vote;

    public Feature() {
    }

    public Feature(String id, String name, String url, int vote) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.vote = vote;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
