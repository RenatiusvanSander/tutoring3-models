package edu.remad.tutoring3;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

public class DateConvertTest {

	@Test
	public void test() {
		System.out.println("Test");
		String date = "2026-01-05T23:00:00.000Z";
		ZonedDateTime parse = ZonedDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME)
				.withZoneSameInstant(ZoneId.systemDefault());
		System.out.println(parse);
		System.out.println(parse.toLocalDateTime());
	}
}
