package org.javaacademy.module1.homework.four.ex4;

import org.javaacademy.homework.four.ex4.exception.UserListException;

public class UsersList {
    private int freeSlotsUserList;

    private User[] users;

    public void init(int maxUsers) {
        users = new User[maxUsers];
        freeSlotsUserList = maxUsers;
    }

    public void addUserToList(User user) throws UserListException {
        if (freeSlotsUserList == 0) {
            throw new UserListException("Превышено допустимое значение пула пользователей.");
        }
        users[users.length - freeSlotsUserList] = user;
        freeSlotsUserList--;
    }

    public User[] getUsers() {
        return users;
    }

    public int getFreeSlotsUserList() {
        return freeSlotsUserList;
    }

    public User searchUser(String userName) {
        if (freeSlotsUserList == users.length) {
            return null;
        }
        for (User user : users) {
            if (user != null && user.getName().equals(userName)) {
                return user;
            }
        }
        return null;
    }
}
