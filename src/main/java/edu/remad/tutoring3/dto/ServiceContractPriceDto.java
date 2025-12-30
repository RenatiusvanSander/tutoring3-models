package edu.remad.tutoring3.dto;

import edu.remad.tutoring3.persistence.models.ServiceContractPriceEntity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Stores service contract price
 * 
 * @author edu.remad
 * @since 2025
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class ServiceContractPriceDto {
	
	private long id;
	
	private long userId;
	
	private long serviceContractId;
	
	private long priceId;
	
	private boolean confirmed;
	
	/**
	 * Constructor
	 * 
	 * @param scpe {@link ServiceContractPriceEntity}
	 */
	public ServiceContractPriceDto(ServiceContractPriceEntity scpe) {
		setId(scpe.getId());
		setUserId(scpe.getUserId().getUserId());
		setServiceContractId(scpe.getServiceContractId().getServiceContractNo());
		setPriceId(scpe.getPriceId().getId());
		setConfirmed(scpe.isConfirmed());
	}

}
