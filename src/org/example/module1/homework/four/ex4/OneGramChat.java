package org.example.homework.four.ex4;

import org.example.homework.four.ex4.exception.AuthorizeException;
import org.example.homework.four.ex4.exception.MenuOperationException;
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
        System.out.println("OneGramChat запущен.\n");
        startChat();
    }

    private void initializeUsersList() {
        UsersList usersList = new UsersList();
        usersList.init(maxUsers);
        this.usersList = usersList;
    }
    
    private void initializeMenu() {
        mainMenu = new String[]{
                "[1] - Войти",
                "[2] - Добавить пользователя",
                "[3] - Выйти",
                "[4] - Написать письмо",
                "[5] - Прочитать письмо",
                "[6] - Exit"
        };
    }

    private void startChat() {

        try {
            openMenu();
        } catch (MenuOperationException e) {
            System.out.println(e.getMessage());
            startChat();
        }
    }

    private void openMenu() throws MenuOperationException {

        while (true) {
            System.out.print("\n");
            for (String item : mainMenu) {
                System.out.println(item);
            }
            System.out.println("\nВыберите нужное действие:");

            String choice = scanner.nextLine();

            if (mainMenu[0].equals(choice)) {
                comeIn();
            } else if (mainMenu[1].equals(choice)) {
                addUser();
            } else if (mainMenu[2].equals(choice)) {
                try {
                    comeOut();
                } catch (AuthorizeException e) {
                    System.out.println(e.getMessage());
                }
            } else if (mainMenu[3].equals(choice)) {
                try {
                    sendMessage();
                } catch (AuthorizeException e) {
                    System.out.println(e.getMessage());
                }
            } else if (mainMenu[4].equals(choice)) {
                try {
                    printMessage();
                } catch (AuthorizeException e) {
                    System.out.println(e.getMessage());
                }
            } else if (mainMenu[5].equals(choice)) {
                System.out.println("Программа завершена.");
                break;
            } else {
                throw new MenuOperationException("Некорректное действие. Повторите ввод.");
            }
        }
    }

    private void comeIn() {
        User searchingUser;
        while (true) {
            if (usersList.getFreeSlotsUserList() != usersList.getUsers().length) {
                System.out.println("Введите имя пользователя: ");
                String choiceName = scanner.nextLine();
                if (!choiceName.isEmpty()) {
                    searchingUser = usersList.searchUser(choiceName);
                    if (searchingUser != null) {
                        while (true) {
                            System.out.println("Введите пароль пользователя: ");
                            String choicePass = scanner.nextLine();
                            if (searchingUser.getPassword().equals(choicePass) && !choicePass.isEmpty()) {
                                System.out.println("\nВы авторизовались в системе.");
                                authorizedUser = searchingUser;
                            } else {
                                System.out.println("\nПароль неверный. Авторизация отклонена.");
                            }
                            break;
                        }
                        break;
                    } else {
                        System.out.println("\nПользователь отсутствует в базе данных.");
                        break;
                    }
                }
            } else {
                System.out.println("\nБаза данных не заполнена. Пользователей нет.");
                break;
            }
        }
    }

    private void comeOut() throws AuthorizeException {
        if (authorizedUser == null) {
            throw new AuthorizeException("\nВы не авторизованы в системе.");
        }
        authorizedUser = null;
        System.out.println("\nВы вышли из системы.");
    }

    private void addUser() {
        User.addUser(usersList);
    }

    private void sendMessage() throws AuthorizeException {
        if (authorizedUser == null) {
            throw new AuthorizeException("\nВы не авторизованы в системе.");
        }
        try {
            authorizedUser.sendMessage(usersList);
        } catch (UserNameException e) {
            System.out.println(e.getMessage());
        }

    }

    private void printMessage() throws AuthorizeException {
        if (authorizedUser == null) {
            throw new AuthorizeException("\nВы не авторизованы в системе.");
        }
        try {
            authorizedUser.printMessage();
        } catch (MessageListException e) {
            System.out.println(e.getMessage());
        }
    }
}
