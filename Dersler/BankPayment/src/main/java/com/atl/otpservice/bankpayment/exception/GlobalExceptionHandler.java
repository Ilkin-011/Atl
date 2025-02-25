package com.atl.otpservice.bankpayment.exception;

import com.atl.otpservice.bankpayment.dto.RedisStatusResponse;
import com.atl.otpservice.bankpayment.dto.StatusResponseDto;
import com.atl.otpservice.bankpayment.util.enums.PaymentStatus;
import com.atl.otpservice.bankpayment.util.enums.RedisStatus;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

    @ExceptionHandler(value = BankEnoughFundsException.class)
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public StatusResponseDto thereAreNotEnoughFunds(BankEnoughFundsException ex) {
        return new StatusResponseDto(PaymentStatus.INSUFFICIENT_BALANCE, ex.getMessage());
    }

    @ExceptionHandler(value = UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public StatusResponseDto thereAreNotFound(UserNotFoundException ex) {
        return new StatusResponseDto(PaymentStatus.NOT_FOUND_USER, ex.getMessage());
    }
    @ExceptionHandler(value = ErrorTransferException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public StatusResponseDto errorTransfer(ErrorTransferException ex) {
        return new StatusResponseDto(PaymentStatus.FAIL, ex.getMessage());
    }
    @ExceptionHandler(value = BalanceNotEnough.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public StatusResponseDto errorTransfer(BalanceNotEnough ex) {
        return new StatusResponseDto(PaymentStatus.FAIL, ex.getMessage());
    }
    @ExceptionHandler(value = RedisKeyNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public RedisStatusResponse errorNotFoundKeyExceptionHandler(RedisKeyNotFoundException ex) {
        return new RedisStatusResponse(RedisStatus.FAIL, ex.getMessage());
    }
    @ExceptionHandler(value = BlockAccountException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public StatusResponseDto BlockAccountExceptionHandler(BlockAccountException ex) {
        return new StatusResponseDto(PaymentStatus.BLOCK, ex.getMessage());
    }


}
