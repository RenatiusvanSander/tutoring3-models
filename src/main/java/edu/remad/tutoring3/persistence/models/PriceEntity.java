package edu.remad.tutoring3.persistence.models;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import edu.remad.tutoring3.dto.PriceDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * price data
 * 
 * @author edu.remad
 * @since 2025
 */
@Entity
@Table(name = "price_entity")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Builder
public class PriceEntity {
	
	/**
	 * Constructor
	 * 
	 * @param price {@link PriceDto}
	 */
	public PriceEntity(PriceDto price) {
		setId(price.getId());
		setPrice(new BigDecimal(price.getPrice()));
		setCurrency(price.getCurrency());
	}
	
	/**
	 * the primary key for a price
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "price_id")
	private long id;
	
	/** price with precision 16 and scale 2*/
	@Column(precision = 16, scale = 2)
	private BigDecimal price;
	
	/** currency */
	private String currency;
	
	@NotNull
	@Column(name = "creation_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime creationDate;
}
