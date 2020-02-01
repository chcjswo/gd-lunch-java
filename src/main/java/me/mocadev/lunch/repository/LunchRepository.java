package me.mocadev.lunch.repository;

import me.mocadev.lunch.model.Lunches;
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

}
