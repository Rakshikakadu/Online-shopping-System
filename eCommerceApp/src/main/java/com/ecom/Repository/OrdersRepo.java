package com.ecom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.Entity.Orders;


@Repository
public interface OrdersRepo extends JpaRepository<Orders, Integer>{

}
