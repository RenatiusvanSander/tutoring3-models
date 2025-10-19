package edu.remad.tutoring3.persistence.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "service_contract_prices")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class ServiceContractPriceEntity {
	
	/**
	 * service contract price as primary key
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	// One To One
	private UserEntity userId;
	
	// One to One
	private ServiceContractEntity serviceContractId;
	
	// One to One
	private PriceEntity priceId;
	
	private boolean confirmed;

}
