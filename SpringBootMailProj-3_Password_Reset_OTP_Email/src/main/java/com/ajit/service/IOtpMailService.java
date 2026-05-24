package com.ajit.service;

import com.ajit.model.OtpRequest;

public interface IOtpMailService {

	 void sendOtpMail(OtpRequest request);
}