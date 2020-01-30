package me.mocadev.lunch.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * https://github.com/chcjswo
 * https://mocadev.tistory.com
 *
 * @author chcjswo
 * @date 2020-01-12
 */

@Document(collection = "Lunches")
@Data
public class Lunches {
    @Id
    private String _id;

    @Field("lunch_date")
    private String lunchDate;

    @Field("restaurant_name")
    private String restaurantName;

    @Field("user_name")
    private String user_name;
}
