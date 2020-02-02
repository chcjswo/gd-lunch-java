package me.mocadev.lunch.model;

import java.util.Date;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author chcjswo
 * @date 2020-01-12
 */
@Document(collection = "restaurants")
@Getter
@NoArgsConstructor
public class Restaurants {
	@Id
	private String _id;

	private Integer choiceCount;

	private Integer visitCount;

	private String name;

	private Date createdAt;

    @Builder
    public Restaurants(Integer choiceCount, Integer visitCount, String name) {
        this.choiceCount = choiceCount;
        this.visitCount = visitCount;
        this.name = name;
    }
}
