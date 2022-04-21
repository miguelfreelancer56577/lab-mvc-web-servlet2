package com.github.mangelt.storage.service.impl;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

import com.github.mangelt.storage.dto.ImageDetailsPayload;
import com.github.mangelt.storage.dto.ReponseBodyPayload;
import com.github.mangelt.storage.exception.AppException;
import com.github.mangelt.storage.service.StorageService;
import com.github.mangelt.storage.util.ApiConstants;
import org.apache.commons.io.FilenameUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LocalStorageImpl implements StorageService {

	private final String path = "C:\\Users\\MTorresRenteria\\Pictures\\";
	
	@Override
	public ResponseEntity<ReponseBodyPayload<List<ImageDetailsPayload>>> listAvailableImages() {
		final ReponseBodyPayload<List<ImageDetailsPayload>> response = new ReponseBodyPayload<>(HttpStatus.OK.value(), ApiConstants.MSG_OK_IMAGE_LIST);
		final List<ImageDetailsPayload> lstImages = new ArrayList<>(); 
		response.setContent(lstImages);
		try(DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(Paths.get(path), path->FilenameUtils
				.getExtension(path.toString()).equals(ApiConstants.CARD_JPG))) {
			newDirectoryStream.forEach(file->{
				try {
					lstImages.add(ImageDetailsPayload
							.builder()
							.imageName(FilenameUtils.getBaseName(file.toString()))
							.format(FilenameUtils.getExtension(file.toString()))
							.size(file.toFile().length())
							.uploadedDate(Files.readAttributes(file, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS).creationTime().toMillis())
							.build());
				} catch (IOException e) {
					throw new AppException(ApiConstants.EXP_ERROR_READ_METADATA_IMAGES, e);
				}
			});
		} catch (Exception e) {
			throw new AppException(ApiConstants.EXP_ERROR_READ_AVAILABLE_IMAGES, e);
		}
		return ResponseEntity.ok(response);
	}

}
