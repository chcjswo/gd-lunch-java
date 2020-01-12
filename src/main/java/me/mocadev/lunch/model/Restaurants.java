package me.mocadev.lunch.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
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
@Setter
@ToString
public class Restaurants {
	@Id
	private String _id;

	private Integer choiceCount;

	private Integer visitCount;

	private String name;

	private Date createdAt;
}
