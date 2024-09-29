package Game;

import java.util.HashMap;
import java.util.Map;

public class ConversationManager {
    private Map<String, String> conversations;

    public ConversationManager() {
        conversations = new HashMap<>();
        // Populate with predetermined conversations
        conversations.put("schoolGate_talk", "Boy: Oh, sorry about that! What brings you here?");
    }

    public String getConversation(String key) {
        return conversations.get(key);
    }
}
