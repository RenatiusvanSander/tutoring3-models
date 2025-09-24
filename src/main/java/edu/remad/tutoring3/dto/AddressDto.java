package edu.remad.tutoring3.dto;

import java.time.LocalDateTime;

import edu.remad.tutoring3.persistence.models.AddressEntity;
import edu.remad.tutoring3.persistence.models.UserEntity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Stores address' information.
 * 
 * @author edu.remad
 * @since 2025
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class AddressDto {

	private long id;
	private String addressStreet;
	private String addressHouseNo;
	private int addressZipCode;
	private String place;
	private long userId;

	/**
	 * Constructor
	 * 
	 * @param address {@link AddressEntity}
	 */
	public AddressDto(AddressEntity address) {
		setId(address.getId());
		setAddressStreet(address.getAddressStreet());
		setAddressHouseNo(address.getAddressHouseNo());
		setAddressZipCode(address.getAddressZipCode());
		setPlace(address.getPlace());
		setUserId(address.getUser().getUserId());
	}

}
