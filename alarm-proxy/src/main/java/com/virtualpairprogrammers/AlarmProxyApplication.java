package com.virtualpairprogrammers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A proxy to (initially) simulate Jenkins. TODO we may need this to call the real
 * Jenkins, or maybe we can build a Jenkins plugin. To be explored. For now, this
 * app simply defines an endpoint at /alarm. It returns a string of Red, Green or Amber.
 * 
 * Part of the Arduino Alarm Project.
 */
@SpringBootApplication
public class AlarmProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlarmProxyApplication.class, args);
	}
}
