package edu.remad.tutoring3.persistence.models;

import java.time.LocalDateTime;

import edu.remad.tutoring3.dto.InvoiceDto;
import edu.remad.tutoring3.helper.LocalDateTimeHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Invoice data of an {@link TutoringAppointmentEntity} and is also generated to a PDF.
 * 
 * @author edu.remad
 * @since 2025
 */
@Entity
@Table(name = "invoice_entity")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class InvoiceEntity {
	
	/**
	 * the primary key for an invoice
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "invoice_no")
	private long no;
	
	/**
	 * service contract's identifier
	 */
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_contract_id")
	private ServiceContractEntity serviceContractId;
	
	/**
	 * amount of tutoring hours booked as float
	 */
	private float tutoringHours;
	
	/**
	 * date of tutoring hours
	 */
	@Column(name = "date", columnDefinition = "TIMESTAMP")
	private LocalDateTime date;
	
	/**
	 * tutoring time of the date
	 */
	@Column(name = "tutoring_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime tutoringDate;
	
	/**
	 * User identifier and {@link UserEntity}
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "user_id")
	private UserEntity userId;
	
	/**
	 * price's identifier and data {@link PriceEntity}
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "price_id")
	private PriceEntity priceId;
	
	/**
	 * creation date of invoice
	 */
	@Column(name = "creation_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime creationDate;
	
	/**
	 * Constructor
	 * 
	 * @param invoiceDto {@link InvoiceDto} to {@link InvoiceEntity}
	 * @param serviceContract {@link ServiceContractEntity}
	 * @param user {@link UserEntity}
	 * @param price {@link PriceEntity}
	 */
	public InvoiceEntity(InvoiceDto invoiceDto, ServiceContractEntity serviceContract, UserEntity user, PriceEntity price, LocalDateTime now) {
		setNo(invoiceDto.getNo());
		setServiceContractId(serviceContract);
		setTutoringHours(invoiceDto.getTutoringHours());
		setDate(LocalDateTimeHelper.convertIsoTimeStringToLocalDateTime(invoiceDto.getDate()));
		setTutoringDate(LocalDateTimeHelper.convertIsoTimeStringToLocalDateTime(invoiceDto.getTutoringDate()));
		setUserId(user);
		setPriceId(price);
		setCreationDate(now);
	}
	
	/**
	 * Constructor
	 * 
	 * @param invoiceDto {@link InvoiceDto} to {@link InvoiceEntity}
	 * @param serviceContract {@link ServiceContractEntity}
	 * @param user {@link UserEntity}
	 * @param price {@link PriceEntity}
	 */
	public InvoiceEntity(InvoiceDto invoiceDto, ServiceContractEntity serviceContract, UserEntity user, PriceEntity price) {
		setNo(invoiceDto.getNo());
		setServiceContractId(serviceContract);
		setTutoringHours(invoiceDto.getTutoringHours());
		setDate(LocalDateTimeHelper.convertIsoTimeStringToLocalDateTime(invoiceDto.getDate()));
		setTutoringDate(LocalDateTimeHelper.convertIsoTimeStringToLocalDateTime(invoiceDto.getTutoringDate()));
		setUserId(user);
		setPriceId(price);
	}

}
