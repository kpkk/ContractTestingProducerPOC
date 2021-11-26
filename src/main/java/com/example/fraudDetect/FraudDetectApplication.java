package com.example.fraudDetect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FraudDetectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FraudDetectApplication.class, args);
	}



}
@RestController
class FraudController{

	@GetMapping("/frauds")
	ResponseEntity<List<String>>getFrauds(){
		return ResponseEntity.status(200).body(Arrays.asList("pradeep","verified"));
	}
}
