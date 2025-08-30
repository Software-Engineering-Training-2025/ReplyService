package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ReplyService replyService = new ReplyService();
        System.out.println(replyService.reply("hello", ReplyType.FRIENDLY));
        System.out.println("-------------------------------------------------");
        System.out.println(replyService.reply("hello", ReplyType.FORMAL));
        System.out.println("-------------------------------------------------");
        System.out.println(replyService.reply("hello", ReplyType.CONCISE));
    }
}