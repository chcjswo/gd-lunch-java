package me.mocadev.lunch.service;

import java.util.List;
import java.util.Optional;
import me.mocadev.lunch.model.Restaurants;
import me.mocadev.lunch.repository.RestaurantRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author admin
 * @date 2020-01-12
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
class RestaurantServiceTest {

    @Autowired
    RestaurantService restaurantService;

    @Autowired
    RestaurantRepository restaurantRepository;

    @BeforeEach
    public void setUp() {
//        restaurantService(restaurantRepository);
//        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void allTest() {
        List<Restaurants> list = restaurantService.all();
//        List<Restaurants> list = restaurantRepository.findAll();
        System.out.println(list);
    }

    @Test
    public void restaurantTest() {
//        List<Restaurants> list = restaurantService.all();
        Optional<Restaurants> restaurant = restaurantRepository.findById("5cc5763d73b56400171349dc");
        System.out.println(restaurant);
    }

}
