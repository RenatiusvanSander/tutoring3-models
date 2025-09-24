package edu.remad.tutoring3.dto;

import edu.remad.tutoring3.persistence.models.UserEntity;
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
public class UserDto {

	private long userId;
	private String name;
	private String email;
	private boolean emailVerified;
	private String givenName;
	private String familyName;
	private String preferredUsername;
	private String sub;
	private long[] addressIds;

	/**
	 * Constructor
	 * 
	 * @param user {@link UserEntity}
	 */
	public UserDto(UserEntity user) {
		setUserId(user.getUserId());
		setName(user.getName());
		setEmail(user.getEmail());
		setEmailVerified(user.getEmailVerified().booleanValue());
		setGivenName(user.getGivenName());
		setFamilyName(user.getFamilyName());
		setPreferredUsername(user.getPreferredUsername());
		setSub(user.getSub());
		long[] addresses = user.getAddresses().stream().mapToLong(item -> item.getId()).toArray();
		setAddressIds(addresses);
	}

}
