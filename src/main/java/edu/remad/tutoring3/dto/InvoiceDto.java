package edu.remad.tutoring3.dto;

import java.time.format.DateTimeFormatter;

import edu.remad.tutoring3.persistence.models.InvoiceEntity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Stores invoice data
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
public class InvoiceDto {

	private long no;
	
	private long serviceContractId;
	
	private float tutoringHours;
	
	private String date;
	
	private String tutoringDate;
	
	private long userId;
	
	private long priceId;
	
	/**
	 * Constructor
	 * 
	 * @param invoice {@link InvoiceEntity} to {@link InvoiceDto}
	 */
	public InvoiceDto(InvoiceEntity invoice) {
		setNo(invoice.getNo());
		setServiceContractId(invoice.getServiceContractId().getServiceContractNo());
		setTutoringHours(invoice.getTutoringHours());
		setDate(invoice.getTutoringDate().format(DateTimeFormatter.ISO_DATE_TIME));
		setTutoringDate(invoice.getTutoringDate().format(DateTimeFormatter.ISO_DATE_TIME));
		setUserId(invoice.getUserId().getUserId());
		setPriceId(invoice.getPriceId().getId());
	}
}
