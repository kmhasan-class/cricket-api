package bd.edu.seu.cricketapi.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.util.Pair;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Ball {
    @DBRef
    private String matchId;
    private LocalDateTime dateTime;
    private int overNumber;
    private int ballNumber;
    private Player bowler;
    private Player batsman;
    private Pair<RunType, Integer> runTypeIntegerPair;
    private Pair<ExtraType, Integer> extraTypeIntegerPair;
    private Pair<OutType, Player> outTypePlayerPair;
    private String commentary;
    private List<Comment> commentList;
}
