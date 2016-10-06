package com.ottobots.services;

import com.ottobots.domain.Feature;

import java.util.List;

/**
 * Created by nzetwa01 on 10/6/2016.
 */
public interface FeatureDAO {
    void upVote(int id);
    void downVote(int id);
    List<Feature> getFeatures();
}
