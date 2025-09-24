package edu.remad.tutoring3.dto;

import edu.remad.tutoring3.persistence.models.AddressEntity;

/**
 * Stores address' information.
 * 
 * @author edu.remad
 * @since 2025
 */
public class AddressDto {

	private long id;
	private String addressStreet;
	private String addressHouseNo;
	private int addressZipCode;
	private String place;
	private long userId;

	/**
	 * Constructor
	 */
	public AddressDto() {
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param addressStreet
	 * @param addressHouseNo
	 * @param addressZipCode
	 * @param place
	 * @param userId
	 */
	public AddressDto(long id, String addressStreet, String addressHouseNo, int addressZipCode, String place,
			long userId) {
		this.id = id;
		this.addressStreet = addressStreet;
		this.addressHouseNo = addressHouseNo;
		this.addressZipCode = addressZipCode;
		this.place = place;
		this.userId = userId;
	}

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddressStreet() {
		return addressStreet;
	}

	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	public String getAddressHouseNo() {
		return addressHouseNo;
	}

	public void setAddressHouseNo(String addressHouseNo) {
		this.addressHouseNo = addressHouseNo;
	}

	public int getAddressZipCode() {
		return addressZipCode;
	}

	public void setAddressZipCode(int addressZipCode) {
		this.addressZipCode = addressZipCode;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}
