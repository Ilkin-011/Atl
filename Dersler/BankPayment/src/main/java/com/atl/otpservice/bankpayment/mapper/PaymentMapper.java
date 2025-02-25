package com.atl.otpservice.bankpayment.mapper;

import com.atl.otpservice.bankpayment.dao.entity.PaymentEntity;
import com.atl.otpservice.bankpayment.dto.PaymentRequestDto;
import com.atl.otpservice.bankpayment.dto.PaymentResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface PaymentMapper {
PaymentEntity dtoToEntity(PaymentRequestDto dto);
List<PaymentResponseDto>entityToListDto(List<PaymentEntity> entity);
}