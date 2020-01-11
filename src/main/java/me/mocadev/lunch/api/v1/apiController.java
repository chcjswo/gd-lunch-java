package me.mocadev.lunch.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class apiController {

	@GetMapping("/list")
	public String list() {
		return "list";
	}
}
