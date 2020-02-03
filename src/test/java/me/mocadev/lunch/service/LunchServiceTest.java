package me.mocadev.lunch.service;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.Optional;
import me.mocadev.lunch.model.Lunches;
import me.mocadev.lunch.model.Restaurants;
import me.mocadev.lunch.repository.LunchRepository;
import me.mocadev.lunch.repository.RestaurantRepository;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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
 * @date 2020-02-03
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
class LunchServiceTest {

	@Autowired
	LunchService lunchService;

	@Autowired
    LunchRepository lunchRepository;

	@BeforeEach
	public void setUp() {
//		MockitoAnnotations.initMocks(this);
	}

	@Disabled
	@Test
	public void allTest() {
		List<Lunches> list = lunchService.all();
        System.out.println(list);
        assertThat(list,
            hasItem(Matchers.<Lunches>hasProperty("name", is("무극라멘"))));
	}

    @Disabled
	@Test
	public void lunchTest() {
		Optional<Lunches> lunch = lunchRepository.findById("5cc5763d73b56400171349dc");
        assert lunch.orElse(null) != null;
        org.assertj.core.api.Assertions.assertThat(lunch.orElse(null).getRestaurantName()).isEqualTo("양파볶음밥");
	}

}
