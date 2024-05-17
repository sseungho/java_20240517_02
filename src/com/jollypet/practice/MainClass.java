package com.jollypet.practice;

import java.util.Calendar;
import java.util.spi.CalendarDataProvider;

import com.jollypet.test.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker worker1 = new Worker();

		Calendar calendar;
		
		CalendarDataProvider calendarData;
		Worker worker2 = new Worker();
		worker2.name = "sss";
		worker2.printName2();
	}

}
