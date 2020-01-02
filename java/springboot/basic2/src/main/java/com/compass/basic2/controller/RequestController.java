package com.compass.basic2.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.compass.basic2.model.Member;
import com.compass.basic2.model.User;

@Controller
public class RequestController {
	@GetMapping("req/http")
	public String http(HttpServletRequest request) {
		String name = request.getParameter("name1");
		String pageNum = request.getParameter("pageNum1");
		return name + ", " + pageNum;
	}

	@GetMapping("req/param1")
	public String param1(@RequestParam("key1") String key1, @RequestParam("key2") String key2) {
		return key1 + ", " + key2;
	}

	@GetMapping("req/param2")
	public Map<String, Object> param2(@RequestParam Map<String, Object> map) {
		return map;
	}

	@GetMapping("req/path/{path1}/{path2}")
	public String path(@PathVariable("path1") String path1, @PathVariable("path2") String path2) {
		return path1 + ", " + path2;
	}

	@GetMapping("signUp")
	public String signUp(@ModelAttribute User user) {
		return "signUp";
	}

	@GetMapping("req/model")
	public String model(@ModelAttribute Member member) {
		return member.toString();
	}

}
