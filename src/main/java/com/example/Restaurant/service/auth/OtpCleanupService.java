package com.example.Restaurant.service.auth;

import com.example.Restaurant.repo.OtpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OtpCleanupService {

    @Autowired
    private OtpRepository otpRepository;

    @Scheduled(fixedRate = 600000) // Run every 10 minutes
    public void cleanupExpiredOtps() {
        otpRepository.deleteByExpirationTimeBefore(LocalDateTime.now());
    }
}
