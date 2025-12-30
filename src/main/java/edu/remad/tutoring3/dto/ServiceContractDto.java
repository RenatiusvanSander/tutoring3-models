package edu.remad.tutoring3.dto;

import edu.remad.tutoring3.persistence.models.ServiceContractEntity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Stores service contract
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
public class ServiceContractDto {

	private long serviceContractNo;
	private String serviceContractName;
	private String serviceContractDescription;
	
	/**
	 * Constructor
	 * 
	 * @param sc {@link ServiceContractEntity}
	 */
	public ServiceContractDto(ServiceContractEntity sc) {
		setServiceContractNo(sc.getServiceContractNo());
		setServiceContractName(sc.getServiceContractName());
		setServiceContractDescription(sc.getServiceContractDescription());
	}
}
