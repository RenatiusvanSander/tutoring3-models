package edu.remad.tutoring3.persistence.models;

import static jakarta.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "priceentity")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Builder
public class PriceEntity {
	
	/**
	 * the primary key for a price
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "price_id", unique = true)
	private long id;
	
	/** price with precision 16 and scale 2*/
	@Column(precision = 16, scale = 2)
	private BigDecimal price;
	
	/** currency */
	private String currency;
}
