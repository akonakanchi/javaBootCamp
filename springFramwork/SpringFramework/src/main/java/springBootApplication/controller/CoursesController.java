package springBootApplication.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

record Course(int id,String name, String Author){};
@RestController
public class CoursesController {

    @GetMapping("/courses")
    public List<Course> getCoursesList(){
        return Arrays.asList(new Course(1,"123","234"));
    }

    @GetMapping("/courses/1")
    public Course getCoursesDetails(){
        return new Course(1,"123","234");
    }

}
