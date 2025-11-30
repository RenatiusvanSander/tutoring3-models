package edu.remad.tutoring3.helper;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * LocalDateTime helper has several converting methods
 * 
 * @author edu.remad
 * @since 2025
 */
public final class LocalDateTimeHelper {

	private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

	private LocalDateTimeHelper() {
		// not supported
		throw new UnsupportedOperationException(
				"You are not allowed to create intsance of " + this.getClass().getCanonicalName());
	}

	/**
	 * Converts a Strng in ISO-8601 format in {@link LocalDateTime}
	 * 
	 * @param iso8601Time String encoded as ISO-8601 time
	 * @return {@link LocalDateTime}
	 */
	public static LocalDateTime convertIsoTimeStringToLocalDateTime(String iso8601Time) {
		return LocalDateTime.parse(iso8601Time, dateTimeFormatter);
	}

}
