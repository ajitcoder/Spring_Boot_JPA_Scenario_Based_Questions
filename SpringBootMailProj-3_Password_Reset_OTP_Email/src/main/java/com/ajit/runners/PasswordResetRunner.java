package com.ajit.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ajit.model.OtpRequest;
import com.ajit.service.IOtpMailService;
import com.ajit.util.OtpGenerator;
@Component
public class PasswordResetRunner implements CommandLineRunner{

	@Autowired
    private IOtpMailService otpMailService;

    @Override
    public void run(String... args) {

        System.out.println("Password reset requested...");
        System.out.println("Generating OTP...");

        String otp = OtpGenerator.generateOtp();
        System.out.println("OTP generated: " + otp);

        OtpRequest request = new OtpRequest(
                "ajitkr80923097@gmail.com",
                otp,
                OtpGenerator.generateExpiryTime()
        );

        otpMailService.sendOtpMail(request);
    }
}