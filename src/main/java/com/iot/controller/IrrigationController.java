package com.iot.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iot.model.Device;
import com.iot.services.StartableDeviceService;

/**
 * Created by Kranthi Kiran on 28-May-16
 * Modified by kranthi on 29-Sep-16
 */
@RestController
public class IrrigationController {
	
	private static Logger log = Logger.getLogger(IrrigationController.class.getName());

	private StartableDeviceService irrigationService;
	
	@Autowired
	public void setIrrigationService(StartableDeviceService irrigationService){
		this.irrigationService = irrigationService;
	}
	
	//@CrossOrigin(origins = "https://smiley-plant-ui.run.aws-usw02-pr.ice.predix.io")
    @RequestMapping("/startsignal")
    public void startPlantWatering(){
    	irrigationService.start();
    	log.info("Plant Watering Started...");
    }
    
	//@CrossOrigin(origins = "https://smiley-plant-ui.run.aws-usw02-pr.ice.predix.io")
    @RequestMapping("/stopsignal")
    public void stopPlantWatering(){
    	irrigationService.stop();
    	log.info("Plant Watering Stopped...");
    }
    
    @RequestMapping("/devicestate/{deviceid}")
    public Device getDeviceDetails(@RequestParam(value = "deviceid", defaultValue = "101") int deviceid){
    	return irrigationService.getDeviceDetails(deviceid);
    }
    
}
