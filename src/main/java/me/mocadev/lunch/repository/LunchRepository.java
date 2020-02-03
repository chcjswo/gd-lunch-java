package me.mocadev.lunch.repository;

import java.util.List;
import me.mocadev.lunch.model.Lunches;
import me.mocadev.lunch.model.Restaurants;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author admin
 * @date 2020-02-01
 */
@Repository
public interface LunchRepository extends MongoRepository<Lunches, String> {
    List<Lunches> findAll();
}
