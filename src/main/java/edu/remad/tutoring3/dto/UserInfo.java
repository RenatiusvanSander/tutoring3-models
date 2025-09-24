package edu.remad.tutoring3.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Stores user's information.
 * 
 * @author edu.remad
 * @since 2025
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class UserInfo {

	private String sub;
	private String email_verified;
	private String name;
	private String preferred_username;
	private String given_name;
	private String family_name;
	private String email;

}