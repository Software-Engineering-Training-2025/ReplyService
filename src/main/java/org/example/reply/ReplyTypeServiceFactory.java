package org.example.reply;

import org.example.ReplyType;

public class ReplyTypeServiceFactory {
    public static ReplyTypeService getReplyTypeServiceByType(ReplyType type) {
        if(type == ReplyType.FORMAL) {
            return new FormalReplyTypeService();
        } else if(type == ReplyType.FRIENDLY) {
            return new FriendlyReplyTypeService();
        } else if(type == ReplyType.CONCISE) {
            return new ConciseReplyTypeService();
        }
        throw new RuntimeException("reply service type is not supported " + type.name());
    }
}
