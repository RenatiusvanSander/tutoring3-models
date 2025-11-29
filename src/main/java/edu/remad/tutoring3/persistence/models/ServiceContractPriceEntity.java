package edu.remad.tutoring3.persistence.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * service contract price data
 * 
 * @author edu.remad
 * @since 2025
 */
@Entity
@Table(name = "service_contract_price_entity")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class ServiceContractPriceEntity {
	
	/** service contract price as primary key */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_entity_id")
	private UserEntity userId;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_contract_entity_id")
	private ServiceContractEntity serviceContractId;
    
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "price_entity_id")
	private PriceEntity priceId;
	
	private boolean confirmed;
	
	@NotNull
	@Column(name = "creation_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime creationDate;

}
