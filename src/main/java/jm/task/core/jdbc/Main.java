package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        //userService.createUsersTable();
        //userService.dropUsersTable();
        //userService.saveUser("Kolya", "Ya", (byte) 25);
        //userService.removeUserById(1);
        //userService.getAllUsers();
        //userService.cleanUsersTable();

    }
}
