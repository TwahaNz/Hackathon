package com.ottobots.services.implementation;

import com.ottobots.domain.Feature;
import com.ottobots.services.FeatureDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by nzetwa01 on 10/6/2016.
 */
public class FeatureDAOImpl implements FeatureDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public FeatureDAOImpl(DataSource datasource) {
        jdbcTemplate = new JdbcTemplate(datasource);
    }

    @Override
    public void upVote(String id) {

       // String updateString= String.format("UPDATE FEATURE SET VOTES = VOTES +1 WHERE id = %d", id);
       // jdbcTemplate.execute(updateString);
        jdbcTemplate.update("UPDATE FEATURE SET VOTES = VOTES + 1 WHERE id = ?", id);
    }

    @Override
    public void downVote(String id) {
        //String updateString= String.format("UPDATE FEATURE SET VOTES = VOTES -1 WHERE id = %d", id);
        // jdbcTemplate.execute(updateString);

        jdbcTemplate.update("UPDATE FEATURE SET VOTES = VOTES - 1 WHERE id = (?)", id);
    }

    @Override
    public List<Feature> getFeatures() {


        String getString = String.format("SELECT id, name, url, votes FROM FEATURE");
        return jdbcTemplate.query("SELECT * FROM FEATURE", new RowMapper<Feature>() {
                    @Override
                    public Feature mapRow(ResultSet resultSet, int i) throws SQLException {

                        Feature feature = new Feature();
                        feature.setId(resultSet.getString("ID"));
                        feature.setName(resultSet.getString("Name"));
                        feature.setUrl(resultSet.getString("Url"));
                        feature.setVote(resultSet.getInt("Votes"));
                        return feature;
                    }

                }

        );

    }
}
