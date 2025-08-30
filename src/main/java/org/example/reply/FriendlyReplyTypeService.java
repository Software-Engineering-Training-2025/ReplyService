package org.example.reply;

public class FriendlyReplyTypeService implements ReplyTypeService {
    @Override
    public String getReply(String message) {
        return switch (message) {
            case "hi" -> "Hey there! 😊 How can I help?";
            case "hello" -> "Hi! 👋 What’s up?";
            case "how are you" -> "Doing great! 😄 How can I help?";
            case "i need help" -> "I’ve got you! 🙂 Tell me a bit more.";
            case "can you help me with my account" -> "Sure thing! 😊 What’s wrong with the account?";
            case "thanks" -> "Anytime! 🙌";
            case "bye" -> "See you later! 👋";
            case "what is your name" -> "I’m your helper bot 🤖";
            default -> "Could you tell me more?";
        };
    }
}
