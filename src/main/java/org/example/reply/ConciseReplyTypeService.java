package org.example.reply;

public class ConciseReplyTypeService implements ReplyTypeService {
    @Override
    public String getReply(String message) {
        return switch (message) {
            case "hi", "hello" -> "Hello. How can I help?";
            case "how are you" -> "I’m good. How can I help?";
            case "i need help" -> "Share details; I’ll help.";
            case "can you help me with my account" -> "Describe the account issue…";
            case "thanks" -> "You’re welcome.";
            case "bye" -> "Goodbye.";
            case "what is your name" -> "I’m your assistant.";
            default -> "Please clarify.";
        };
    }
}
