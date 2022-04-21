package com.github.mangelt.storage.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FieldError implements Serializable {
	private static final long serialVersionUID = -5173081991581412220L;
	String fieldName;
	String fieldMessage;
}
