package javaDateAndTime;

import java.time.*;


public class CurrentDateProgram {
	public static void main(String[] args) {
    LocalDate ld=LocalDate.now();
    System.out.println(ld);
    
    LocalTime lt=LocalTime.now();
    System.out.println(lt);
    
    LocalDateTime ldt=LocalDateTime.now();
    System.out.println(ldt);
    
	}
}
