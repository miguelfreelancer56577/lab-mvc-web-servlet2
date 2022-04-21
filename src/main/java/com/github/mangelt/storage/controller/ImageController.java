package com.github.mangelt.storage.controller;

import java.util.List;

import com.github.mangelt.storage.dto.ImageDetailsPayload;
import com.github.mangelt.storage.dto.ReponseBodyPayload;
import com.github.mangelt.storage.service.StorageService;
import com.github.mangelt.storage.util.ApiConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiConstants.BASE_API_URL)
public class ImageController {

	@Autowired
	StorageService storageService;
	
	@GetMapping(path = ApiConstants.MAPPING_IMAGE)
	public ResponseEntity<ReponseBodyPayload<List<ImageDetailsPayload>>> listImages(){
		return storageService.listAvailableImages();
	}

}
