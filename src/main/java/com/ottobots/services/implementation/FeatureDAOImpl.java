package com.ottobots.services.implementation;

import com.ottobots.domain.Feature;
import com.ottobots.services.FeatureDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by nzetwa01 on 10/6/2016.
 */
public class FeatureDAOImpl implements FeatureDAO
{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void upVote(int id) {
        jdbcTemplate.update("UPDATE FEATURE SET VOTES = VOTES +1 WHERE id = %d", id);
    }

    @Override
    public void downVote(int id) {
        //String updateString= String.format("UPDATE FEATURE SET VOTES = VOTES -1 WHERE id = %d", id);
        // jdbcTemplate.execute(updateString);
        jdbcTemplate.update("UPDATE FEATURE SET VOTES = VOTES -1 WHERE id = ?", id);
    }

    @Override
    public List<Feature> getFeatures() {
        String getString= String.format("SELECT * FROM FEATURE SET VOTES = VOTES -1 WHERE id = %d");
        return jdbcTemplate.queryForList(getString, Feature.class);
    }
}
