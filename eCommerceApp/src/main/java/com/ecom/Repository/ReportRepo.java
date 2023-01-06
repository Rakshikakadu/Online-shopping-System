package com.ecom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.Entity.Report;


@Repository
public interface ReportRepo extends JpaRepository<Report, Integer>{

}
