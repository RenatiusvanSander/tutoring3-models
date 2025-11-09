package edu.remad.tutoring3.dto;

import edu.remad.tutoring3.persistence.models.PriceEntity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Stores prices
 * 
 * @author edu.remad
 * @since 2025
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class PriceDto {
	
	private long id;
	
	private float price;
	
	private String currency;
	
	/**
	 * Constructor
	 * 
	 * @param price {@link PriceEntity}
	 */
	public PriceDto(PriceEntity price) {
		setId(price.getId());
		setPrice(price.getPrice().floatValue());
		setCurrency(price.getCurrency());
	}
}
