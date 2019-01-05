package bd.edu.seu.cricketapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class Match {
    @Id
    private String id;
    private MatchType matchType;
    private Ground ground;
    private Team team1;
    private Team team2;
    private Team homeTeam;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private List<Ball> ballList;
}
