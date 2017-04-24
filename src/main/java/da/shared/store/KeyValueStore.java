package da.shared.store;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dagrawal on 24-Apr-17.
 */
public class KeyValueStore {
    private final Map<String, String> STORE = new HashMap<String, String>();

    public String add(String key, String value) {
        return STORE.putIfAbsent(key, value);
    }

    public String remove(String key) {
        return STORE.remove(key);
    }

    public void update(String key, String value) {
        STORE.put(key, value);
    }

    public String get(String key) {
        return STORE.getOrDefault(key, null);
    }
}
