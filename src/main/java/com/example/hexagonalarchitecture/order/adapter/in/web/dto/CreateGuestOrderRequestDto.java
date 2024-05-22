package com.example.hexagonalarchitecture.order.adapter.in.web.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class CreateGuestOrderRequestDto {
    private String customerName;
    private List<Long> productIds;
}