package com.atl.otpservice.otpp.rest;

public record VerifyOtpRequest(String msisdn,String otpCode) {
}
