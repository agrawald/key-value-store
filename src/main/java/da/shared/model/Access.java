package da.shared.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Created by dagrawal on 24-Apr-17.
 */
@Getter
@Setter
public class Access extends Message {
    private Operation operation;
}
