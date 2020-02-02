package me.mocadev.lunch.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.mocadev.lunch.model.Restaurants;
import me.mocadev.lunch.repository.RestaurantRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author admin
 * @date 2020-01-12
 */
@RequiredArgsConstructor
@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    private final MongoTemplate mongoTemplate;

    public List<Restaurants> all() {
        return restaurantRepository.findAll();
    }
}
