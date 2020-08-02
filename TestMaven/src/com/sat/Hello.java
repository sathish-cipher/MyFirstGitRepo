package com.sat;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Locale;

public class Hello {
		public static void main(String[] args) {
			LocalDateTime dt=LocalDateTime.now();
			System.out.println(dt.toLocalDate());
	}
}
