package com.project.os.database;

import org.bson.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.os.model.CouponAndFeedback;

public interface CouponAndFeedbackRepository extends MongoRepository<CouponAndFeedback, String>{

	Document findByofferId(String offerId);


	

}
