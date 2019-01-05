package bd.edu.seu.cricketapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Player extends Person {
    @Id
    private String id;
    private int jerseyNumber;
    private PlayerRole playerRole;
    private BatsmanType batsmanType;
    private BowlerType bowlerType;
}
