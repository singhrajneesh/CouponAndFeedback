package com.project.os.model;

public class CouponAndFeedback {
	private String couponId;
	private String userId;
	private String offerId;
	private int rating;
	private String feedback;
	public CouponAndFeedback() {
	
	}
	
	public CouponAndFeedback(String couponId, String userId, String offerId,int rating,String feedback) {
		super();
		this.couponId = couponId;
		this.userId = userId;
		this.offerId = offerId;
		this.rating = rating;
		this.feedback=feedback;
	}

	public String getCouponId() {
		return couponId;
	}

	public String getUserId() {
		return userId;
	}

	public String getOfferId() {
		return offerId;
	}

	public int getRating() {
		return rating;
	}

	public String getFeedback() {
		return feedback;
	}

	

}
