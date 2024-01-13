package org.javaacademy.module1.homework.four.ex4;



public class Message {
    private final String text;
    private final MessageType messageType;
    private final User fromUser;
    private final User toUser;

    private Message(User fromUser, User toUser, MessageType messageType, String text) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.messageType = messageType;
        this.text = text;
    }

    public static <MessageListException extends Throwable> void sendMessage(User fromUser, User toUser, String text) {
        Message messageOutgoing = new Message(fromUser, toUser, MessageType.OUTGOING, text);
        Message messageIncoming = new Message(fromUser, toUser, MessageType.INCOMING, text);

        try {
            sendOut(messageOutgoing);
        } catch (MessageListException e) {
            System.out.println(e.getMessage());
        }
        try {
            sendIn(messageIncoming);
        } catch (MessageListException e) {
            System.out.println(e.getMessage());
        }

    }

    public void printMessage(Message message) {
        if (message.messageType == MessageType.INCOMING) {
            System.out.printf("Письмо от %s: %s\n", message.fromUser.getName(), message.text);
        } else if (message.messageType == MessageType.OUTGOING) {
            System.out.printf("Письмо к %s: %s\n", message.toUser.getName(), message.text);
        }
    }

    private static void sendOut(Message messageOutgoing) throws MessageListException {
        if (messageOutgoing.fromUser.getFreeSlotsMessages() == 0) {
            throw new MessageListException("\nПереполнен почтовый ящик у отправителя.");
        }
        messageOutgoing.fromUser.getMessageList()[messageOutgoing.fromUser.getMessageList().length - messageOutgoing.fromUser.getFreeSlotsMessages()] = messageOutgoing;
        messageOutgoing.fromUser.setFreeSlotsMessages(messageOutgoing.fromUser.getFreeSlotsMessages() - 1);
    }
    private static void sendIn(Message messageIncoming) throws MessageListException {
        if (messageIncoming.toUser.getFreeSlotsMessages() == 0) {
            throw new MessageListException("\nПереполнен почтовый ящик у получателя.");
        }
        messageIncoming.toUser.getMessageList()[messageIncoming.toUser.getMessageList().length - messageIncoming.toUser.getFreeSlotsMessages()] = messageIncoming;
        messageIncoming.toUser.setFreeSlotsMessages(messageIncoming.toUser.getFreeSlotsMessages() - 1);
    }
}
