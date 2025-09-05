package edu.remad.tutoring3.persistence.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
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
@Table(name = "addressentity", uniqueConstraints = { @UniqueConstraint(columnNames = {"address_id"})})
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
	@Column(name="address_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	/**
	 * the street
	 */
	private String addressStreet;

	/**
	 * house number
	 */
	private String addressHouseNo;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "user")
//	private UserEntity user;

	/**
	 * the zip code
	 */
	private int addressZipCode;
	
	/**
	 * the place of living
	 */
	private String place;

	@Override
	public String toString() {
		return "AddressEntity [id=" + id + ", addressStreet=" + addressStreet + ", addressHouseNo=" + addressHouseNo
				+ ", addressZipCode=" + addressZipCode + ", place=" + place + "]";
	}
	
}
