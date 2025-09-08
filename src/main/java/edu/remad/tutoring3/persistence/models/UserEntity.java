package edu.remad.tutoring3.persistence.models;

import java.time.LocalDateTime;import edu.remad.tutoring3.dto.UserInfo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Contains information of an user
 * 
 * @author edu.remad
 * @since 2025
 */
@Entity
@Table(name = "userentity", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "user_id","preferred_username", "email", "sub" }) })
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class UserEntity {

	@Id
	@Column(name="user_id", unique = true)
	private String userId;

	@NotNull
	@Column(name = "name", unique = true)
	private String name;

	@NotNull
	@Column(name = "email")
	private String email;

	@NotNull
	@Column(name = "email_verified")
	private Boolean emailVerified;

	@NotNull
	@Column(name = "given_name")
	private String givenName;

	@NotNull
	@Column(name = "family_name")
	private String familyName;

	@NotNull
	@Column(name = "preferred_username")
	private String preferredUsername;

	@NotNull
	@Column(name = "sub")
	private String sub;

	@NotNull
	@Column(name = "creation_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime creationDate;
	
	/**
	 * Copy-Constructor
	 * 
	 * @param userInfo {@link UserInfo}
	 */
	public UserEntity(UserInfo userInfo) {
		UserEntity user = new UserEntity();
		user.setCreationDate(LocalDateTime.now());
		user.setEmail(userInfo.getEmail());
		user.setEmailVerified(userInfo.getEmail_verified());
		user.setFamilyName(userInfo.getFamily_name());
		user.setGivenName(userInfo.getGiven_name());
		user.setName(userInfo.getName());
		user.setPreferredUsername(userInfo.getPreferred_username());
		user.setSub(userInfo.getSub());
		user.setUserId(userInfo.getSub());
	}
}