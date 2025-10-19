package edu.remad.tutoring3.persistence.models;

import java.time.LocalDateTime;

import edu.remad.tutoring3.dto.ServiceContractDto;
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

/**
 * service contract
 * 
 * @author edu.remad
 * @since 2025
 */
@Entity
@Table(name = "service_contract_entity")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class ServiceContractEntity {
	
	/**
	 * Constructor
	 * 
	 * @param serviceContract {@link serviceContract}
	 */
	public ServiceContractEntity(ServiceContractDto serviceContract) {
		setServiceContractNo(serviceContract.getServiceContractNo());
		setServiceContractName(serviceContract.getServiceContractName());
		setServiceContractDescription(serviceContract.getServiceContractDescription());
	}

	/**
	 * service contract number as primary key
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_contract_no")
	private long serviceContractNo;

	/**
	 * name of service contract
	 */
	private String serviceContractName;

	/**
	 * description of service contract
	 */
	private String serviceContractDescription;

	/**
	 * creation date of service contract
	 */
	@Column(name = "creation_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime serviceContractCreationDate;

}
