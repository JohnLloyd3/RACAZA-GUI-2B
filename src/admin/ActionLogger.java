package admin;

import config.Logs;

public class ActionLogger {

    public static void logAction(int userID, String action) {
        Logs.logAction(userID, action);
    }
}
