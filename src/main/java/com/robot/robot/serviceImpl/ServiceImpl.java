package com.robot.robot.serviceImpl;

import com.robot.robot.entity.Robot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceImpl {

    private static final Logger logger = LoggerFactory.getLogger(ServiceImpl.class);
    @Autowired Robot robot;

    public String distance_covered(){
        if(battery>7%){
            return "low battery";
        }
        else
            return "distance covered is this";

    }

    public string weight_carried(){
        if(weight_carried>15kg)
        {
            return "overweight";
        }
        else
            return  "weight_carried";
    }
}
