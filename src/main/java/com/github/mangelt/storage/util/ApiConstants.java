package com.github.mangelt.storage.util;

public class ApiConstants {
	private ApiConstants() {}
	public static final String BASE_API_URL = "/api/v1";
	public static final String MAPPING_IMAGE = "/images";

//	message for validation
	public static final String IMAGE_SERVICE_NAME_MANDATORY = "Name of the image is mandatory.";
	public static final String IMAGE_SERVICE_FILE_IMAGE_MANDATORY = "File image is mandatory.";
	public static final String IMAGE_SERVICE_FILE_IMAGE_ALREADY_REGISTERED = "There is an image already registered with that name.";

//	request params
	public static final String REQ_PARAM_IMAGE_NAME = "imageName";

//	signs and cords used along with the application 
	public static final String SIGN_DOT = ".";
	public static final String CARD_JPG = "jpg";

//	exception messages 
	public static final String EXP_ERROR_READ_FILE = "There was an error to get content's file.";
	public static final String EXP_ERROR_READ_AVAILABLE_IMAGES = "There was an error to list available images from storage.";
	public static final String EXP_ERROR_READ_METADATA_IMAGES = "There was an error getting metadata from the image.";

//	success messages 
	public static final String MSG_OK_IMAGE_SAVE = "The image was stored successfully.";
	public static final String MSG_OK_IMAGE_LIST = "The images were retrieved successfully from the storage.";

}
