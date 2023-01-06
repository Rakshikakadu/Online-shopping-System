package com.ecom.Services;

import java.util.List;

import com.ecom.Entity.Feedback;
import com.ecom.Exception.CustomerException;
import com.ecom.Exception.FeedbackException;

public interface FeedbackService {
	
	public Feedback addFeedback(Feedback feedback) throws FeedbackException;

	public Feedback deleteFeedback(Integer feedbackId) throws FeedbackException;

	public Feedback getFeedbackByID(Integer feedbackId) throws FeedbackException;

	public List<Feedback> getAllFeedbacks() throws FeedbackException;

	public List<Feedback> getFeedbacksByCustomerId(Integer customerId) throws FeedbackException, CustomerException;
}
