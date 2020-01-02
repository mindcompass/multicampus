package com.compass.basic2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceController {

	@GetMapping("/getKakaoService")
	public String getKakaoService() {
		return "getKakaoService";
	}

	@GetMapping("/getNaverService")
	public String getNaverService() {
		return "getNaverService";
	}
	@GetMapping("/getKakaoService2")
	public String getKakaoServic2() {
		return "getKakaoService2";
	}
}