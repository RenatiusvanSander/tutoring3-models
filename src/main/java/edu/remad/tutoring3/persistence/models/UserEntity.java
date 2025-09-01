package edu.remad.tutoring3.persistence.models;

import java.time.LocalDateTime;

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

@Entity
@Table(name = "userentity", uniqueConstraints = { @UniqueConstraint(columnNames = "preferred_username"),
		@UniqueConstraint(columnNames = "email"), @UniqueConstraint(columnNames = "sub") })
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class UserEntity {

	@Id
	@Column(unique = true)
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
}