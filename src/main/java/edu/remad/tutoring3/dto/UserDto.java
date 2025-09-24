package edu.remad.tutoring3.dto;

import edu.remad.tutoring3.persistence.models.UserEntity;

/**
 * Stores user's information.
 * 
 * @author edu.remad
 * @since 2025
 */
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
	 */
	public UserDto() {
	}

	/**
	 * Constructor
	 * 
	 * @param userId
	 * @param name
	 * @param email
	 * @param emailVerified
	 * @param givenName
	 * @param familyName
	 * @param preferredUsername
	 * @param sub
	 */
	public UserDto(long userId, String name, String email, boolean emailVerified, String givenName, String familyName,
			String preferredUsername, String sub) {
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.emailVerified = emailVerified;
		this.givenName = givenName;
		this.familyName = familyName;
		this.preferredUsername = preferredUsername;
		this.sub = sub;
	}

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

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(boolean emailVerified) {
		this.emailVerified = emailVerified;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getPreferredUsername() {
		return preferredUsername;
	}

	public void setPreferredUsername(String preferredUsername) {
		this.preferredUsername = preferredUsername;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public long[] getAddressIds() {
		return addressIds;
	}

	public void setAddressIds(long[] addresses) {
		this.addressIds = addresses;
	}

}
