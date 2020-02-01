package me.mocadev.lunch.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import me.mocadev.lunch.model.Lunches;
import me.mocadev.lunch.repository.LunchRepository;
import org.springframework.stereotype.Service;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author admin
 * @date 2020-02-01
 */
@RequiredArgsConstructor
@Service
public class LunchService {

    private final LunchRepository lunchRepository;

    public List<Lunches> all() {
        return lunchRepository.findAll();
    }
}
