package com.github.mangelt.storage.service;

import java.util.List;

import com.github.mangelt.storage.dto.ImageDetailsPayload;
import com.github.mangelt.storage.dto.ReponseBodyPayload;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;


public interface StorageService {
	ResponseEntity<ReponseBodyPayload<List<ImageDetailsPayload>>> listAvailableImages();
}