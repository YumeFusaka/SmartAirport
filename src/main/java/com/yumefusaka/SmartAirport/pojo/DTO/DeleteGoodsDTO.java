package com.yumefusaka.SmartAirport.pojo.DTO;

import lombok.Data;

import java.util.List;

@Data
public class DeleteGoodsDTO {
    List<Long> goodsIds;
}
