package bd.edu.seu.cricketapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
public class Ground {
    @Id
    private String id;
    private String city;
    private String country;
    private double longitude;
    private double latitude;
    private int capacity;
    private LocalDate inaugurationDate;
}
