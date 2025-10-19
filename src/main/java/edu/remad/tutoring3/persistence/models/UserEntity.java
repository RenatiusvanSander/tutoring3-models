package edu.remad.tutoring3.persistence.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import edu.remad.tutoring3.dto.UserInfo;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "user_entity", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "preferred_username", "email", "sub" }) })
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long userId;

	@NotNull
	@Column(name = "name")
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

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<AddressEntity> addresses = new ArrayList<>();

	public void addAddress(AddressEntity address) {
		addresses.add(address);
		address.setUserEntity(this);
	}

	public void removeAddress(AddressEntity address) {
		addresses.remove(address);
		address.setUserEntity(null);
	}

	@NotNull
	@Column(name = "creation_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime creationDate;

	/**
	 * Copy-Constructor
	 * 
	 * @param userInfo {@link UserInfo}
	 */
	public UserEntity(UserInfo userInfo) {
		setUserId(0);
		setName(userInfo.getName());
		setEmail(userInfo.getEmail());
		setEmailVerified(Boolean.valueOf(userInfo.getEmail_verified()));
		setGivenName(userInfo.getGiven_name());
		setFamilyName(userInfo.getFamily_name());
		setPreferredUsername(userInfo.getPreferred_username());
		setSub(userInfo.getSub());
		setCreationDate(LocalDateTime.now());
	}
}