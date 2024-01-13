package org.javaacademy.module1.homework.four.ex4;

import org.javaacademy.module1.homework.four.ex4.exception.MessageListException;
import org.javaacademy.module1.homework.four.ex4.exception.UserListException;
import org.javaacademy.module1.homework.four.ex4.exception.UserNameException;

public class User {
    private String name;
    private String password;
    private Message[] messageList = new Message[100];
    private int freeSlotsMessages = messageList.length;

    private User() {}

    public static void addUser(UsersList usersList) {
        User user = new User();
        String choiceName;
        String choicePass;
        User searchingUser;
        while (true) {
            System.out.println("Введите имя пользователя: ");
            choiceName = OneGramChat.scanner.nextLine();
            searchingUser = usersList.searchUser(choiceName);
            if (searchingUser == null) {
                break;
            } else {
                System.out.println("\nИмя пользователя не уникально.");
            }
        }
        user.name = choiceName;

        while (true) {
            System.out.println("Введите пароль пользователя: ");
            choicePass = OneGramChat.scanner.nextLine();
            if (!(checkPassword(choicePass))) {
                break;
            }
        }
        user.password = choicePass;

        try {
            usersList.addUserToList(user);
        } catch (UserListException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Message[] getMessageList() {
        return messageList;
    }

    public int getFreeSlotsMessages() {
        return freeSlotsMessages;
    }

    public void setFreeSlotsMessages(int freeSlotsMessages) {
        this.freeSlotsMessages = freeSlotsMessages;
    }

    private static boolean checkPassword(String choice) {
        boolean check = false;
        if (choice.trim().isEmpty()) {
            System.out.println("\nПароль должен содержать хотя бы один символ и не может быть пробелом.");
            check = true;
        }
        return check;
    }

    public void sendMessage(UsersList usersList) throws UserNameException {
        User searchingUser;
        while (true) {
            System.out.println("Введите имя пользователя получателя: ");
            String choiceName = OneGramChat.scanner.nextLine();

            if (usersList.getFreeSlotsUserList() != usersList.getUsers().length && !choiceName.isEmpty()) {
                searchingUser = usersList.searchUser(choiceName);

                if (searchingUser == null) {
                    throw new UserNameException("\nПолучатель письма отсутствует в базе данных.");
                }
                System.out.println("Введите текст сообщения: ");
                String textMessage = OneGramChat.scanner.nextLine();
                Message.sendMessage(this, searchingUser, textMessage);
                break;
            }
        }
    }

    public void printMessage() throws MessageListException {
        if (freeSlotsMessages == messageList.length) {
            throw new MessageListException("\nНет сообщений.");
        }
        for (Message message : messageList) {
            if (message == null) {
                continue;
            }
            message.printMessage(message);
        }
    }
}
