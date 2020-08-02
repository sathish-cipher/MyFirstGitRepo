package com.sat;

import java.time.LocalDateTime;

public class Hello {
		public static void main(String[] args) {
			LocalDateTime dt=LocalDateTime.now();
			System.out.println(dt.toLocalDate());
			System.out.println("Hello");
	}
}
