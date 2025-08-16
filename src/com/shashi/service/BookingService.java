package com.gautham.service;

import java.util.List;

import com.gautham.beans.HistoryBean;
import com.gautham.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}

