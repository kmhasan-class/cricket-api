package bd.edu.seu.cricketapi.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private String nationality;
    private LocalDate dateOfBirth;
    // height

}
