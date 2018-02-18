package com.netwizard.util;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateUtil {

	public static Date getGMTDate() {
		ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
		Date date = Date.from(utc.toInstant());
		return date;
	}

}
