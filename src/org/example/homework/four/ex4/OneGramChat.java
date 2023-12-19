package org.example.homework.four.ex4;

import org.example.homework.four.ex4.exception.AuthorizeException;
import org.example.homework.four.ex4.exception.MessageListException;
import org.example.homework.four.ex4.exception.UserNameException;

import java.util.Scanner;

public class OneGramChat {
    private int maxUsers = 100;
    private UsersList usersList;
    private User authorizedUser;
    private String[] mainMenu;
    public static Scanner scanner = new Scanner(System.in);
    
    public OneGramChat() {
    }

    public void initChat() {
        initializeUsersList();
        initializeMenu();
        startChat();
    }

    public void initializeUsersList() {
        UsersList usersList = new UsersList();
        usersList.init(maxUsers);
        this.usersList = usersList;
    }
    
    public void initializeMenu() {
        mainMenu = new String[]{
                "[1] - Войти",
                "[2] - Добавить пользователя",
                "[3] - Выйти",
                "[4] - Написать письмо",
                "[5] - Прочитать письмо",
                "[6] - Exit"
        };
    }

    public void startChat() {
        System.out.println("OneGramChat запущен.");
        System.out.println("");

        while (true) {
            System.out.println("");
            for (String item : mainMenu) {
                System.out.println(item);
            }
            System.out.println("");
            System.out.println("Выберите нужное действие:");

            int choice = scanner.nextInt();

            if (choice == 1) {
                comeIn();
            } else if (choice == 2) {
                addUser();
//                System.out.println("\n".repeat(15));
            } else if (choice == 3) {
                comeOut();
//                System.out.println("\n".repeat(15));
            } else if (choice == 4) {
                try {
                    sendMessage();
                } catch (AuthorizeException e) {
                    System.out.println(e.getMessage());
                }
//                System.out.println("\n".repeat(15));
            } else if (choice == 5) {
                try {
                    printMessage();
                } catch (AuthorizeException e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 6) {
                System.out.println("Программа завершена.");
//                System.out.println("\n".repeat(15));
                break;
            }
        }
    }

    public void comeIn() {
        User searchingUser;
        while (true) {
            System.out.println("Введите имя пользователя: ");
            String choiceName = scanner.next();
            if (usersList.getFreeSlotsUserList() != usersList.getUsers().length && choiceName.length() > 0) {
                searchingUser = usersList.searchUser(choiceName);
                if (searchingUser != null) {
                    while (true) {
                        System.out.println("Введите пароль пользователя: ");
                        String choicePass = scanner.next();
                        if (searchingUser.getPassword().equals(choicePass) && choicePass.length() > 0) {
                            System.out.println("Вы авторизовались в системе.");
                            authorizedUser = searchingUser;
                            break;
                        } else {
                            System.out.println("Пароль неверный.");
                        }
                    }
                    break;
                } else {
                    System.out.println("Пользователь отсутствует в базе данных.");
                }
            } else {
                System.out.println("База данных не заполнена. Пользователей нет.");
                break;
            }
        }
    }

    public void comeOut() {
        authorizedUser = null;
        System.out.println("Вы вышли из системы.");
    }

    public void addUser() {
        User.addUser(usersList);
    }

    public void sendMessage() throws AuthorizeException {
        if (authorizedUser == null) {
            throw new AuthorizeException("Вы не авторизованы в системе.");
        }
        try {
            authorizedUser.sendMessage(usersList);
        } catch (UserNameException e) {
            System.out.println(e.getMessage());
        }

    }

    public void printMessage() throws AuthorizeException {
        if (authorizedUser == null) {
            throw new AuthorizeException("Вы не авторизованы в системе.");
        }
        try {
            authorizedUser.printMessage();
        } catch (MessageListException e) {
            System.out.println(e.getMessage());
        }
    }
}
