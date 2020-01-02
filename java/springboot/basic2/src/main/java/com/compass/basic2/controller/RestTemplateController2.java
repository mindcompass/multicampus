package com.compass.basic2.controller;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


@Controller
public class RestTemplateController2 {
	

	Map<String, Object> entity = null;
	@GetMapping("/getKakao3")
	public ResponseEntity<Map> getKakaoService(@RequestParam("address") String address ) {
		RestTemplate rt = new RestTemplate();
		RequestEntity requestEntity = null;
		try {
			requestEntity = RequestEntity
					.get(new URI("https://dapi.kakao.com/v2/local/search/address.json?query="
							+ URLEncoder.encode(address, "utf-8")))
					.header("Authorization", "KakaoAK d4be7b479f4b4cbd99bd19ae87f88b4b").build();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		ResponseEntity<Map> entity = rt.exchange(requestEntity, Map.class);
		return entity;
	}
	public String data(Model model) {
		entity = new HashMap<>(entity);
		model.addAttribute("entity", entity);
		return "getKakaoService2";
	}
	

}
