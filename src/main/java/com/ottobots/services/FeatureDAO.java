package com.ottobots.services;

import com.ottobots.domain.Feature;

import java.util.List;

/**
 * Created by nzetwa01 on 10/6/2016.
 */
public interface FeatureDAO {
    void upVote(String id);
    void downVote(String id);

    List<Feature> getFeatures();
}
