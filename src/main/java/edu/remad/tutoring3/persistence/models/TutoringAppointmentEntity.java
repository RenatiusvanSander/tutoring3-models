package edu.remad.tutoring3.persistence.models;

import java.time.LocalDateTime;

import edu.remad.tutoring3.dto.TutoringAppointmentDto;
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
@Table(name = "tutoring_appointment_entity")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class TutoringAppointmentEntity {

	/**
	 * tutoring appointment number as primary key of a tutoring appointment
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tutoring_appointment_no")
	private long tutoringAppointmentNo;

//	/**
//	 * tutoring appointment's customer number
//	 */
//	@OneToOne
//	@JoinColumn(name = "tutoring_appointment_user", referencedColumnName = "id")
//	private UserEntity tutoringAppointmentUser;

	/**
	 * date of tutoring appointment
	 */
	@Column(name = "tutoring_appointment_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime tutoringAppointmentDate;

	/**
	 * tutoring appointment's time as start date time
	 */
	@Column(name = "tutoring_appointment_start_date_time", columnDefinition = "TIMESTAMP")
	private LocalDateTime tutoringAppointmentStartDateTime;

	/**
	 * tutoring appointment's time as end date time
	 */
	@Column(name = "tutoring_appointment_end_date_time", columnDefinition = "TIMESTAMP")
	private LocalDateTime tutoringAppointmentEndDateTime;
	
//	private ServiceContractEntity serviceContractEntity;
	
	/**
	 * when done it is {@code true}
	 */
	private boolean isAccomplished;

	/**
	 * tutoring appointment's creation date
	 */
	@Column(name = "tutoring_appointment_creation_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime tutoringAppointmentCreationDate;
	
	/**
	 * Constructor
	 * 
	 * @param tutoringAppointment
	 */
	public TutoringAppointmentEntity(TutoringAppointmentDto tutoringAppointment) {
		setTutoringAppointmentNo(tutoringAppointment.getId());
		setTutoringAppointmentDate(null);
		setTutoringAppointmentStartDateTime(null);
		setTutoringAppointmentEndDateTime(null);
		setAccomplished(tutoringAppointment.isAccomplished());
	}
}

