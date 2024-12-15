/* (C) 2024 
 Property of ModifyMotors Inc. */
package com.githubactions.app;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {
	private UUID id;
	private String text;
	private String sender;
	private String receiver;
}
