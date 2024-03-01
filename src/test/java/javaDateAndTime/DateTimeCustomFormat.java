package javaDateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.mysql.cj.x.protobuf.MysqlxConnection.Capabilities;

public class DateTimeCustomFormat {
	
	public static void main(String[] args) {
  
		LocalDateTime myLocalObj=LocalDateTime.now();
		System.out.println(myLocalObj);
		DateTimeFormatter myFormatObj=DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		String finalObj=myLocalObj.format(myFormatObj);
		System.out.println(finalObj);
	}

}
