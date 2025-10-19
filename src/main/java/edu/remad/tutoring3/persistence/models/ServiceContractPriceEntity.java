package edu.remad.tutoring3.persistence.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "servicecontractpriceentity")
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
	private long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private UserEntity userId;
	
	@OneToOne(fetch = FetchType.LAZY)
    @MapsId
	private ServiceContractEntity serviceContractId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId
	private PriceEntity priceId;
	
	private boolean confirmed;

}
