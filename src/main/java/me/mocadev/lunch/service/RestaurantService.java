package me.mocadev.lunch.service;

import java.util.List;
import me.mocadev.lunch.model.Restaurants;
import me.mocadev.lunch.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author admin
 * @date 2020-01-12
 */
@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurants> all() {
        return restaurantRepository.findAll();
    }
}
