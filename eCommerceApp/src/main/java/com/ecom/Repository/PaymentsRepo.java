package com.ecom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.Entity.Payments;


@Repository
public interface PaymentsRepo extends JpaRepository<Payments, Integer>{

}
