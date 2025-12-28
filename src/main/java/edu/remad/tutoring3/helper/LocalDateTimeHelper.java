package edu.remad.tutoring3.helper;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalDateTime helper has several converting methods
 * 
 * @author edu.remad
 * @since 2025
 */
public final class LocalDateTimeHelper {

	private static final DateTimeFormatter isoDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

	/**
	 * private Constructor forbids initialization
	 */
	private LocalDateTimeHelper() {
		// not supported
		throw new UnsupportedOperationException(
				"You are not allowed to create intsance of " + this.getClass().getCanonicalName());
	}

	/**
	 * Converts a String in ISO-8601 format in {@link LocalDateTime}. Converted via
	 * a {@link ZonedDateTime} and added are ZoneId of OS default
	 * 
	 * @param iso8601Time String encoded as ISO-8601 time
	 * @return {@link LocalDateTime}
	 */
	public static LocalDateTime convertIsoTimeStringToLocalDateTime(String iso8601Time) {
		return ZonedDateTime.parse(iso8601Time, DateTimeFormatter.ISO_DATE_TIME)
				.withZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime();
	}

	/**
	 * Converts a String in ISO-8601 format in {@link LocalDateTime}. Converted via
	 * {@link DateTimeFormatter}.
	 * 
	 * @param iso8601Time string encoded as ISO-8601 time without Z
	 * @return {@link LocalDateTime}
	 */
	public static LocalDateTime convertIsoTimeWithoutZToLocalDateTime(String iso8601Time) {
		return LocalDateTime.parse(iso8601Time, isoDateTimeFormatter);
	}

}
