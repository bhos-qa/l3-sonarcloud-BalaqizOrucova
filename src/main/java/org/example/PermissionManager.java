package org.example;

// PermissionManager.java
public class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;


    public String getRoleName(PermissionLevel level) {
        if (level == null) {
            return "Unknown";
        }

        switch (level) {
            case ADMIN:
                return "Admin";
            case DEVELOPER:
                return "Developer";
            case USER:
                return "User";
            default:
                return "Unknown";
        }
    }

    public void setPermissionLevel(PermissionLevel level) {
        this.mCurrentLevel = level;
    }

    public PermissionLevel getCurrentLevel() {
        return mCurrentLevel;
    }

}
