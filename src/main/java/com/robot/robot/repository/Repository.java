package com.robot.robot.repository;

import com.robot.robot.entity.Robot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository <Robot, Integer>{
}
