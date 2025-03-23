package edu.remad.tutoring3.persistence.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.management.relation.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "userentity")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
//	@Pattern(regexp = RegexAppConstants.USERNAME_REGEX)
	private String username;

	@NotBlank
//	@Pattern(regexp = RegexAppConstants.EMAIL_REGEX)
	private String email;

	@NotBlank
	private String password;

	private Boolean enabled;

	@Default
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "user_rules", joinColumns = {
			@JoinColumn(name = "user_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "role_id", referencedColumnName = "id") })
	private List<Role> roles = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private List<TokenEntity> tokens;
	
	@NotBlank
	@Pattern(regexp = RegexAppConstants.FIRST_NAME_REGEX)
	private String firstName;
	
	@NotBlank
	@Pattern(regexp = RegexAppConstants.LAST_NAME_REGEX)
	private String lastName;
	
	@NotBlank
	@Pattern(regexp = RegexAppConstants.GENDER_REGEX)
	private String gender;
	
	@NotBlank
	@Pattern(regexp = RegexAppConstants.CELL_PHONE_REGEX)
	private String cellPhone;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<AddressEntity> addresses;
	
	@Column(name = "creation_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime creationDate;
}