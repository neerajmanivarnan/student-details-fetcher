package com.neeraj.springrest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Replace with your React app URL
public class HomeController {
    
    @Autowired
    private studentRepo sr;
    students student;
    
   
   


    //fetch the data of all students
    @GetMapping("getStudents")
    public List getReq(){
        List<students>  s1 = sr.findAll();

        return s1;
    }


    //get students data from user id
    @GetMapping("getStudent")
    public Optional<students>  getReqUid(@RequestParam("uid") int uid){
        Optional<students>  s1 = sr.findById(uid);

        return s1;
    }


    //get students data from name
    // @GetMapping("/getStudentName")
    // public Optional<students>  getReqName(@RequestParam("name") String name){
    //     Optional<students>  s1 = sr.findByName(name);

    //     return s1;
    // }

    @PostMapping("getStudent")
    public students  getReqUid(students student){
        // student.setUid(uid);
        // student.setName(name);
        sr.save(student);

        return student;

       
    }


    @DeleteMapping("getStudent")
    public students  getReqUidDelete(students student){
        sr.delete(student);

        return student;

       
    }

   



}
