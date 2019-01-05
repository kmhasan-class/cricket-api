package bd.edu.seu.cricketapi.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Comment {
    private User user;
    private LocalDateTime dateTime;
    private String message;
    private Comment responseToComment;
    private List<User> likedByList;
    private List<User> dislikedByList;
}
