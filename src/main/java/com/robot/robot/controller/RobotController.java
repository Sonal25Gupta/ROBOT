package com.robot.robot.controller;

import com.robot.robot.entity.Robot;
import com.robot.robot.repository.Repository;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RobotController {

    @PutMapping("/update/{weight}")
    private Robot update(@RequestBody Robot robot)
    {
        Repository.save(robot);
        return robot;
    }
}
