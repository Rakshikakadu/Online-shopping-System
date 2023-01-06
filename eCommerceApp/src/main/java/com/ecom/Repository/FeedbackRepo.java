package com.ecom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.Entity.Feedback;


@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer>{

}
