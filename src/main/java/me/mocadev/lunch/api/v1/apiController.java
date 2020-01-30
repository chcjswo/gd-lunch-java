package me.mocadev.lunch.api.v1;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.mocadev.lunch.model.Restaurants;
import me.mocadev.lunch.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class apiController {

    private final RestaurantService restaurantService;

	@GetMapping("/list")
	public String list() {
		return "list";
	}

	@GetMapping("/")
    public List<Restaurants> all() {
	    return restaurantService.all();
    }
}
