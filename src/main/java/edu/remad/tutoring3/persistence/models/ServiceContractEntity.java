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
@Table(name = "service_contracts")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class ServiceContractEntity {
	
	/**
	 * service contract number as primary key
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	@Column(name = "service_contract_creation_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime serviceContractCreationDate;

}
