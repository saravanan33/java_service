package com.luv2code.Config;

import com.luv2code.demo.Coach;
import com.luv2code.util.Gym;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Config {


    public Coach gymCoach()
    {
        return new Gym();
    }
}
