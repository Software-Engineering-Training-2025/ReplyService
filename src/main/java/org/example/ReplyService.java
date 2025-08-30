package org.example;

import org.example.filter.LowercaseTransform;
import org.example.filter.Transform;
import org.example.filter.TransformerDecorator;
import org.example.filter.TrimTransform;
import org.example.reply.*;

import java.util.List;
import java.util.logging.Filter;

/**
 * Students implement this method to return the exact outputs defined in README.
 */
public class ReplyService {

    public String reply(String message, ReplyType type) {
        if(message==null|| message.trim().isEmpty()){
            return "Please say something.";
        }
        TransformerDecorator transformerDecorator =
                new TransformerDecorator(List.of(new TrimTransform(), new LowercaseTransform()));

        String transformedMessage = transformerDecorator.runTransformers(message); // we can make it better
//        ReplyTypeService replyTypeService = ReplyTypeServiceFactory.getReplyTypeServiceByType(type);
//        return replyTypeService.getReply(filteredMessage);
        return ReplyTypeServiceFactory.getReplyTypeServiceByType(type).getReply(transformedMessage);
    }
}
