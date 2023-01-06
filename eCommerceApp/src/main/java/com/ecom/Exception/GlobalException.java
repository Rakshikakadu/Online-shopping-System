package com.ecom.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(AdminException.class)
	public ResponseEntity<CustomizeErrorDetails> AdminExceptionHandler(AdminException e, WebRequest req) {
		CustomizeErrorDetails err = new CustomizeErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(e.getMessage());
		err.setDescription(req.getDescription(false));

		return new ResponseEntity<CustomizeErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(CategoryException.class)
	public ResponseEntity<CustomizeErrorDetails> CategoryExceptionHandler(CategoryException e, WebRequest req) {
		CustomizeErrorDetails err = new CustomizeErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(e.getMessage());
		err.setDescription(req.getDescription(false));

		return new ResponseEntity<CustomizeErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<CustomizeErrorDetails> CustomerExceptionHandler(CustomerException e, WebRequest req) {
		CustomizeErrorDetails err = new CustomizeErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(e.getMessage());
		err.setDescription(req.getDescription(false));

		return new ResponseEntity<CustomizeErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(FeedbackException.class)
	public ResponseEntity<CustomizeErrorDetails> FeedbackExceptionHandler(FeedbackException e, WebRequest req) {
		CustomizeErrorDetails err = new CustomizeErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(e.getMessage());
		err.setDescription(req.getDescription(false));

		return new ResponseEntity<CustomizeErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(OrdersException.class)
	public ResponseEntity<CustomizeErrorDetails> OrdersExceptionHandler(OrdersException e, WebRequest req) {
		CustomizeErrorDetails err = new CustomizeErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(e.getMessage());
		err.setDescription(req.getDescription(false));

		return new ResponseEntity<CustomizeErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(PaymentException.class)
	public ResponseEntity<CustomizeErrorDetails> PaymentExceptionHandler(PaymentException e, WebRequest req) {
		CustomizeErrorDetails err = new CustomizeErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(e.getMessage());
		err.setDescription(req.getDescription(false));

		return new ResponseEntity<CustomizeErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(ProductException.class)
	public ResponseEntity<CustomizeErrorDetails> ProductExceptionHandler(ProductException e, WebRequest req) {
		CustomizeErrorDetails err = new CustomizeErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(e.getMessage());
		err.setDescription(req.getDescription(false));

		return new ResponseEntity<CustomizeErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(ReportException.class)
	public ResponseEntity<CustomizeErrorDetails> ReportExceptionHandler(ReportException e, WebRequest req) {
		CustomizeErrorDetails err = new CustomizeErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(e.getMessage());
		err.setDescription(req.getDescription(false));

		return new ResponseEntity<CustomizeErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<CustomizeErrorDetails> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException me,
			WebRequest re) {
		CustomizeErrorDetails err = new CustomizeErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(me.getBindingResult().getFieldError().getDefaultMessage());
		err.setDescription(re.getDescription(false));
		return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<CustomizeErrorDetails> noHandlerFoundExceptionHandler(NoHandlerFoundException e, WebRequest req) {

		CustomizeErrorDetails err = new CustomizeErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(e.getMessage());
		err.setDescription(req.getDescription(false));

		return new ResponseEntity<CustomizeErrorDetails>(err, HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<CustomizeErrorDetails> exceptionHandler(Exception me, WebRequest re) {
		CustomizeErrorDetails err = new CustomizeErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(me.getMessage());
		err.setDescription(re.getDescription(false));
		return new ResponseEntity<CustomizeErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}

}
