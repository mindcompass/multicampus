package com.compass.basic2.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.compass.basic2.model.FileInfo;

@Controller
public class UploadController {
	@GetMapping("/upload1")
	public String upload1() {
		return "upload1";
	}

	@PostMapping("/upload1")
	@ResponseBody
	public String upload1Post(MultipartHttpServletRequest mRequest) {
		String result = "";
		List<MultipartFile> mFiles = mRequest.getFiles("file");

		for (int i = 0; i < mFiles.size(); i++) {
			// 업로드 된 파일 정보
			MultipartFile mFile = mFiles.get(i);
			String oName = mFile.getOriginalFilename();
			result += oName + "\n";
			// 지정 경로에 지정 파일명으로 저장
						try {
							mFile.transferTo(new File("C:/dev/" + oName));
						} catch (IllegalStateException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
		}
		return result;
	}

	@GetMapping("/upload2")
	public String upload2() {
		return "upload2";
	}

	@PostMapping("/upload2")
	@ResponseBody
	public String upload2Post(@RequestParam("file") MultipartFile mFile) {
		String result = "";
		String oName = mFile.getOriginalFilename();
		result += oName + "\n";
		return result;
	}

	@GetMapping("/upload3")
	public String upload3() {
		return "upload3";
	}

	@PostMapping("/upload3")
	@ResponseBody
	public String upload3Post(@ModelAttribute FileInfo info) {
		String result = "";
		String oName = info.getFile().getOriginalFilename();
		result += oName + "\n";
		return result;
	}

}
