package com.compass.basic2.model;

import org.springframework.web.multipart.MultipartFile;
import lombok.Data;

@Data
public class FileInfo {
	private MultipartFile file;
}