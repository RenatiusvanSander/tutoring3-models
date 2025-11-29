package edu.remad.tutoring3.dto;

import java.time.ZoneOffset;

import edu.remad.tutoring3.persistence.models.TutoringAppointmentEntity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class TutoringAppointmentDto {
	
	/**
	 * tutoring appointment number as primary key of a tutoring appointment
	 */
	private long id;

	/**
	 * tutoring appointment's customer number
	 */
	private long userId;

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
		setId(tutoringAppointment.getTutoringAppointmentNo());
		setUserId(0);
		setTutoringAppointmentDate(tutoringAppointment.getTutoringAppointmentDate().toInstant(ZoneOffset.UTC).toString());
		setTutoringAppointmentStartDateTime(tutoringAppointment.getTutoringAppointmentStartDateTime().toInstant(ZoneOffset.UTC).toString());
		setTutoringAppointmentEndDateTime(tutoringAppointment.getTutoringAppointmentEndDateTime().toInstant(ZoneOffset.UTC).toString());
		setAccomplished(tutoringAppointment.isAccomplished());
	}
}
