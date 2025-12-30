package edu.remad.tutoring3.dto;

import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import edu.remad.tutoring3.persistence.models.TutoringAppointmentEntity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Stores tutoring appointment
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
public class TutoringAppointmentDto {
	
	/**
	 * tutoring appointment number as primary key of a tutoring appointment
	 */
	private long tutoringAppointmentNo;

	/**
	 * tutoring appointment's customer number
	 */
	private long tutoringAppointmentUser;

	/**
	 * date of tutoring appointment
	 */
	private String tutoringAppointmentDate;

	/**
	 * tutoring appointment's time as start date time
	 */
	private String tutoringAppointmentStartDateTime;

	/**
	 * tutoring appointment's time as end date time
	 */
	private String tutoringAppointmentEndDateTime;
	
	private long serviceContractId;
	
	/**
	 * when done it is {@code true}
	 */
	private boolean isAccomplished;
	
	/**
	 * Constructor
	 * 
	 * @param tutoringAppointment {@link TutoringAppointmentEntity} used to convert to a {@link TutoringAppointmentDto}
	 */
	public TutoringAppointmentDto (TutoringAppointmentEntity tutoringAppointment) {
		setTutoringAppointmentNo(tutoringAppointment.getTutoringAppointmentNo());
		setTutoringAppointmentUser(tutoringAppointment.getTutoringAppointmentUser().getUserId());
		setTutoringAppointmentDate(tutoringAppointment.getTutoringAppointmentDate().format(DateTimeFormatter.ISO_DATE_TIME));
		setTutoringAppointmentStartDateTime(tutoringAppointment.getTutoringAppointmentStartDateTime().format(DateTimeFormatter.ISO_DATE_TIME));
		setTutoringAppointmentEndDateTime(tutoringAppointment.getTutoringAppointmentEndDateTime().format(DateTimeFormatter.ISO_DATE_TIME));
		setServiceContractId(tutoringAppointment.getServiceContractId().getServiceContractNo());
		setAccomplished(tutoringAppointment.isAccomplished());
	}
}
