package com.luv2code.util;

import com.luv2code.demo.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class Gym implements Coach {

    @Override
    public String getWorkOut() {
        return "10 jumps" ;
    }


}
