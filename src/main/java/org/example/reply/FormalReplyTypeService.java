package org.example.reply;

public class FormalReplyTypeService implements ReplyTypeService {
    @Override
    public String getReply(String message) {
        return switch (message) {
            case "hi", "hello" -> "Hello. How may I assist you today?";
            case "how are you" -> "I am functioning properly. How may I assist you?";
            case "i need help" -> "I can assist with that. Please provide more details.";
            case "can you help me with my account" -> "Certainly. Please describe the account issue.";
            case "thanks" -> "You are welcome.";
            case "bye" -> "Goodbye.";
            case "what is your name" -> "I am your virtual assistant.";
            default -> "Could you clarify your request?";
        };
    }
}
