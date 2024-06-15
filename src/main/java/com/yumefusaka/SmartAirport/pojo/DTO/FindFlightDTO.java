package com.yumefusaka.SmartAirport.pojo.DTO;

import com.yumefusaka.SmartAirport.common.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class FindFlightDTO extends Page {
    public String flight_number;

    public String departure_city;

    public String arrival_city;

    public String date_of_departure;

    public int estimated_travel_time;

    public int capacity;
}
