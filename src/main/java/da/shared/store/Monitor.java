package da.shared.store;

import java.util.Stack;

/**
 * Created by dagrawal on 24-Apr-17.
 */
public class Monitor {
    private final static Stack<String> REQUESTS = new Stack<>();

    public String push(String request) {
        return REQUESTS.push(request);
    }

    public String pop() {
        return REQUESTS.pop();
    }

}
