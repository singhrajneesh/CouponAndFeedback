package com.project.os.controller;
import com.project.os.model.CouponAndFeedback;

import com.project.os.database.*;
import com.project.os.model.*;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouponAndFeedbackController {
	
	@Autowired
	public CouponAndFeedbackRepository couponAndFeedbackRepository;
	@PostMapping("/addfeedback")
	public void addCoupon(@RequestBody CouponAndFeedback coup)
	{
		couponAndFeedbackRepository.save(coup);
	}
	
	@GetMapping("/getfeedback/{offerId}")
	public Document retrieveFeedback(@PathVariable String offerId)
	{
		return couponAndFeedbackRepository.findByofferId(offerId);
	}
}
