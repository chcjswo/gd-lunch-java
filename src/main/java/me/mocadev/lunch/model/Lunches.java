package me.mocadev.lunch.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
@Getter
@NoArgsConstructor
public class Lunches {
    @Id
    private String _id;

    @Field("lunch_date")
    private String lunchDate;

    @Field("restaurant_name")
    private String restaurantName;

    @Field("user_name")
    private String userName;

    @Builder
    public Lunches(String lunchDate, String restaurantName, String userName) {
        this.lunchDate = lunchDate;
        this.restaurantName = restaurantName;
        this.userName = userName;
    }
}
