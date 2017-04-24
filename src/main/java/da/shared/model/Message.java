package da.shared.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Created by dagrawal on 24-Apr-17.
 */
@Getter
@Setter
public abstract class Message {
    private LocalDateTime timestamp;
    private String id;
}
