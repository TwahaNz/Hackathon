/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ottobots.controllers;

import com.ottobots.domain.Feature;
import com.ottobots.services.FeatureDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author shiraaz.moollatjie
 */
@Controller
@RequestMapping(value = {"","/"})
public class HomeController {

    @Autowired
    private FeatureDAO featureDAO;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getIndex(){
        ModelAndView result = new ModelAndView("index");
        result.getModel().put("features", featureDAO.getFeatures());
        return result;
    }
}
