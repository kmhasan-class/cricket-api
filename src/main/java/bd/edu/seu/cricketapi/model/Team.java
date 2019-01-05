package bd.edu.seu.cricketapi.model;

import lombok.Data;

import java.util.List;

@Data
public class Team {
    private List<Player> playerList;
    private List<Player> substitutes;
    private List<Person> coach;
    private String representingTeam;
}
