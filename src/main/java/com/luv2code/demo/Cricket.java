package com.luv2code.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cricket {

    private Coach myCoach;
    private Coach myCoach1;

    @Autowired
    public void setCoach( Coach theCoach,
                         Coach theCoach1
    ) {

        this.myCoach = theCoach;
        this.myCoach1 = theCoach1;

    }

    @GetMapping("/dailyWorkOut")
    public String dailyWorkOut() {
        return  myCoach.getWorkOut();
    }

    @GetMapping("/checkBean")
    public String checkBean() {
        return myCoach.getWorkOut();
    }
    @GetMapping("/checkBean1")
    public Coach checkBean1() {
        return myCoach1;
    }

    @GetMapping("/checkBean2")
    public Boolean checkBean2() {
        return myCoach1 == myCoach;
    }

}
