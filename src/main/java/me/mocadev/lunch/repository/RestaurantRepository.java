package me.mocadev.lunch.repository;

import me.mocadev.lunch.model.Restaurants;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author admin
 * @date 2020-01-12
 */
@Repository
public interface RestaurantRepository extends MongoRepository<Restaurants, String> {

}
