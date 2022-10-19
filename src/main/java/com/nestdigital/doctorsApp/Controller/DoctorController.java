package com.nestdigital.doctorsApp.Controller;

import com.nestdigital.doctorsApp.Dao.DoctorDao;
import com.nestdigital.doctorsApp.Model.Doctormodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class DoctorController {
@Autowired
private DoctorDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/adddoctor",consumes = "application/json",produces = "application/json")
    public String adddoctor(@RequestBody Doctormodel doctor){
        System.out.println(doctor.toString());
        dao.save(doctor);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewdoctor")
    public List<Doctormodel> viewdoctor(){
        return (List<Doctormodel>) dao.findAll();
    }
}
