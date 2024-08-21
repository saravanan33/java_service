package com.java.application.java_service.rest;

import com.java.application.java_service.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MVCController {

    @Value("${countries}")
    private List<String> countries;

    @GetMapping("/hello")
    public String sayHello(HttpServletRequest request, Model theModel) {


        System.out.println(request.getRequestURL());
        theModel.addAttribute("theData",java.time.LocalDate.now());
        return "helloworld";
    }

    @GetMapping("/form")
    public String form() {

        return "hello-form";
    }

    @RequestMapping("/process-form")
    public String processForm(HttpServletRequest request, Model theModel) {

        String paramenter = request.getParameter("userName");
        theModel.addAttribute("name",paramenter);
        return "form-result";
    }

    @GetMapping("/student-form")
    public String studentForm(Model theModel) {
        Student student = new Student();
        theModel.addAttribute("student",student);
        theModel.addAttribute("countries",countries);

        return "student-form";
    }

    @GetMapping("/student-details")
    public String studentDetails(@Valid @ModelAttribute("student") Student student,
                                 BindingResult theBuinding
    ) {
        if(theBuinding.hasErrors()) {
            return "student-form";
        }
        System.out.println(student);
        return "student-confirmation";
    }
}
