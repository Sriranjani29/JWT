package com.reviewanalysis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reviewanalysis.entity.Admin;
@Repository
public interface AdminRepository  extends JpaRepository<Admin, Integer>{

}
