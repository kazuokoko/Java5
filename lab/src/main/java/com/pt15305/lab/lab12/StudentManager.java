package com.pt15305.lab.lab12;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gppd")
public class StudentManager {

	@GetMapping
	public String get() {
		return "GET Ma Van Hung PH12447";
	}
	@PostMapping
	public String post() {
		return "ADD Ma Van Hung PH12447";
	}
	@DeleteMapping
	public String delete() {
		return "DELETE Ma Van Hung PH12447";
	}
	@PutMapping
	public String update() {
		return "UPDATE Ma Van Hung PH12447";
	}
}
