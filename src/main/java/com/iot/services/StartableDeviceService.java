package com.iot.services;

import java.util.List;

import com.iot.model.Device;

public interface StartableDeviceService {

	void start();
	
	void stop();
	
	Device getDeviceDetails(int deviceid);
	
	List<Device> listAllDevices();
}
