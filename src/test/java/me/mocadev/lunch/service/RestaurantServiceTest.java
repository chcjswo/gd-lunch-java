package me.mocadev.lunch.service;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.Optional;
import me.mocadev.lunch.model.Restaurants;
import me.mocadev.lunch.repository.RestaurantRepository;
import org.hamcrest.Matchers;
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
//		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void allTest() {
		List<Restaurants> list = restaurantService.all();
        assertThat(list,
            hasItem(Matchers.<Restaurants>hasProperty("name", is("무극라멘"))));
	}

	@Test
	public void restaurantTest() {
		Optional<Restaurants> restaurant = restaurantRepository.findById("5cc5763d73b56400171349dc");
        assert restaurant.orElse(null) != null;
        org.assertj.core.api.Assertions.assertThat(restaurant.orElse(null).getName()).isEqualTo("양파볶음밥");
	}

}
