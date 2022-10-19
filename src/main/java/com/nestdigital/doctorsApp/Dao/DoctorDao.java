package com.nestdigital.doctorsApp.Dao;

import com.nestdigital.doctorsApp.Model.Doctormodel;
import org.springframework.data.repository.CrudRepository;

public interface DoctorDao extends CrudRepository<Doctormodel,Integer> {
}
