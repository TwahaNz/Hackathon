/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ottobots.controllers;

import com.ottobots.services.FeatureDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author shiraaz.moollatjie
 */
@Controller
public class VotingController {
    
    @Autowired
    private FeatureDAO featureDAO;
    
    @RequestMapping("/upvote/{id}")
    public ModelAndView upvote(@PathVariable("id") String id) {
        featureDAO.upVote(id);
        
        ModelAndView result = new ModelAndView("index");
        result.getModel().put("features", featureDAO.getFeatures());
        return result;
    }
    
    @RequestMapping("/downvote/{id}")
    public ModelAndView downvote(@PathVariable("id") String id) {
        featureDAO.downVote(id);
        
        ModelAndView result = new ModelAndView("index");
        result.getModel().put("features", featureDAO.getFeatures());
        return result;
    }
}
