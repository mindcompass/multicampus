package com.compass.basic2.controller;

import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DownloadController {
	@GetMapping("/download")
	public ResponseEntity<Resource> download() throws Exception {
		File file = new File("C:\\Users\\kyuhyunkang\\Downloads\\실습자료\\회귀분석\\fitness.csv");
		InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
		return ResponseEntity.ok()
				.header("content-disposition", "filename=" + URLEncoder.encode(file.getName(), "utf-8"))
				.contentLength(file.length()).contentType(MediaType.parseMediaType("application/octet-stream"))
//				.contentType(MediaType.parseMediaType("image/jpeg")) 이미지 파일만 올리려면 이렇게 하는 것이가?
//				.contentType(MediaType.parseMediaType("text/html"))
//				.contentType(MediaType.parseMediaType("text/plain"))
				.body(resource);
	}
}
