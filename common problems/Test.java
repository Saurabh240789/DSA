package sample;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.TimeZone;
import java.util.UUID;
import java.sql.Date;
import java.sql.Timestamp;


public class Test {
	
	public static void main(String args[]) {
		
		System.out.println("random value :"+UUID.randomUUID());
		
		long cutOffTimeInMillis = System.currentTimeMillis() - (Long.valueOf(8) * 24 * 60 * 60 * 1000);
		Timestamp cutOffTimeStamp = new Timestamp(cutOffTimeInMillis);
		System.out.println(cutOffTimeStamp);
		
		String daysBack ="0";
		long purgeTime = prunePeriod(daysBack); 
		System.out.println(purgeTime);
		
		Timestamp ts=new Timestamp(purgeTime);
		 System.out.println("timestamp  :" +ts);
		 
		 Date resultdate = new Date(purgeTime);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy HH:mm:ss.SSS");    
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println("local UTC time : "+sdf.format(resultdate));
		
		System.out.println("local UTC time from method: "+getUtcTimestampOfMillis(purgeTime));
		
		
		Timestamp ts1= getCurrentTimeInUtc();
		System.out.println("method UTC time : "+ts1);
		System.out.println("method UTC time : "+ts1.getTime());
		
		Timestamp ts2=new Timestamp(resultdate.getTime());
		 System.out.println("timestamp  :" +resultdate);
		
	}

	private static long prunePeriod(String daysBack) {
		return System.currentTimeMillis() - (Long.valueOf(daysBack) * 24 * 60 * 60 * 1000);
	}
	
	public static Timestamp getCurrentTimeInUtc() {
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		return Timestamp.valueOf(zonedDateTime.toLocalDateTime());
	}
	
	public static Timestamp getUtcTimestampOfMillis(long millisecond) {
		ZonedDateTime zonedDateTime = Instant.ofEpochMilli(millisecond).atZone(ZoneOffset.UTC);
		return Timestamp.valueOf(zonedDateTime.toLocalDateTime());
	}

}
