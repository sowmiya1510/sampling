package com.data.controller;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Userlogin {
	@RequestMapping(value="logging",method=RequestMethod.GET)
	public ResponseEntity<?>logfiles(@RequestParam Map<String,String>map){
		Logger log2=LogManager.getLogger("sampling");
		
		try {
			log2.debug("test started:"+map);
			log2.info("test started:"+map);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return new ResponseEntity<>(map,HttpStatus.OK);
		
	}
	@RequestMapping(value="test",method=RequestMethod.GET)
	public ResponseEntity<?>logic(@RequestParam Map<String,String>map){
		Logger log2=LogManager.getLogger("sampling");
		
		try {
			log2.debug("log started:"+map);
			log2.info("log started:"+map);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return new ResponseEntity<>(map,HttpStatus.OK);
		
	}
	
	
	

}
