package edu.remad.tutoring3.persistence.models;

import static jakarta.persistence.GenerationType.IDENTITY;

import java.time.LocalDateTime;

import edu.remad.tutoring3.dto.AddressDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * address data of an {@link UserEntity}
 * 
 * @author edu.remad
 * @since 2025
 */
@Entity
@Table(name = "addressentity")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Builder
public class AddressEntity {

	/**
	 * the primary key for an address
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "address_id", unique = true)
	private long id;

	/**
	 * the street
	 */
	@NotNull
	@Column(name = "address_street")
	private String addressStreet;

	/**
	 * house number
	 */
	@NotNull
	@Column(name = "address_house_number")
	private String addressHouseNo;

	/**
	 * the zip code
	 */
	@NotNull
	@Column(name = "address_zip_code")
	private int addressZipCode;

	/**
	 * the place of living
	 */
	@NotNull
	@Column(name = "place")
	private String place;
	
	@ManyToOne(fetch = FetchType.LAZY)
    private UserEntity user;

	@NotNull
	@Column(name = "creation_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime creationDate;
	
	public void setUserEntity(UserEntity userEntity) {
		user = userEntity;
	}
	
	public AddressEntity(AddressDto address) {
		id = address.getId();
		addressStreet = address.getAddressStreet();
		addressHouseNo = address.getAddressHouseNo();
		addressZipCode = address.getAddressZipCode();
		place = address.getPlace();
	}

	@Override
	public String toString() {
		return "AddressEntity [id=" + id + ", addressStreet=" + addressStreet + ", addressHouseNo=" + addressHouseNo
				+ ", addressZipCode=" + addressZipCode + ", place=" + place + ", creationDate=" + creationDate + "]";
	}

}
