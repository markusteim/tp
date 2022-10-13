package seedu.duke;

public class Ui {
    private static final String INDENTATION = "    ";

    public static void showWelcomeMessage() {
        final String LOGO = "\n"
                +
                "    _____                                              __  __                                         \n"
                +
                "   / ____|                                            |  \\/  |                                        \n"
                +
                "  | |     _   _  _ __  _ __  ___  _ __    ___  _   _  | \\  / |  __ _  _ __    __ _   __ _   ___  _ __ \n"
                +
                "  | |    | | | || '__|| '__|/ _ \\| '_ \\  / __|| | | | | |\\/| | / _` || '_ \\  / _` | / _` | / _ \\| '__|\n"
                +
                "  | |____| |_| || |   | |  |  __/| | | || (__ | |_| | | |  | || (_| || | | || (_| || (_| ||  __/| |   \n"
                +
                "   \\_____|\\__,_||_|   |_|   \\___||_| |_| \\___| \\__, | |_|  |_| \\__,_||_| |_| \\__,_| \\__, | \\___||_|   \n"
                +
                "                                                __/ |                                __/ |            \n"
                +
                "                                               |___/                                |___/             \n";
        showStandardOutput(INDENTATION + "Welcome to " + LOGO);
    }

    public static void showExitMessage() {
        final String EXIT_MESSAGE = "Bye. Thank you for your support!";
        showStandardOutput(INDENTATION + EXIT_MESSAGE);
    }

    public static void showAccountEntryMessage(String username) {
        final String MESSAGE = "You login as " + username + "\n" + INDENTATION + "Please enter any command.";
        showStandardOutput(INDENTATION + MESSAGE);
    }

    public static void showAccountExitMessage(String username) {
        final String MESSAGE = "Wallet " + username + " logout.";
        showStandardOutput(INDENTATION + MESSAGE);
    }

    public static void showExceptionMessage(String exceptionMessage) {
        showStandardOutput(INDENTATION + exceptionMessage);
    }

    // Maybe be improved
    public static void showPromptInfo() {
        String promptInfo = "Would you like to register or login?";
        System.out.println(INDENTATION + promptInfo);
        System.out.println();
    }

    public static void showRegisterInfo() {
        final String MESSAGE = "Nice, we will be creating you a new wallet right away, but first of all, \n"
                +
                INDENTATION
                +
                "please first add your username and then a password for your wallet.";
        showStandardOutput(INDENTATION + MESSAGE);
    }

    public static void showLoginInfo() {
        final String MESSAGE = "Please enter your username and password to login your wallet";
        showStandardOutput(INDENTATION + MESSAGE);
    }

    public static void showRegisterSuccessInfo() {
        final String MESSAGE = "Nice, a new wallet has been created for you, \n"
                +
                INDENTATION
                +
                "You can now login to it";
        showStandardOutput(INDENTATION + MESSAGE);
    }

    public static void showEnterUsernamePrompt() {
        final String MESSAGE = "Please enter your username: ";
        System.out.print(MESSAGE);
    }

    public static void showEnterPasswordPrompt() {
        Ui.showEmptyLine();
        final String MESSAGE = "Please enter your password: ";
        System.out.print(MESSAGE);
    }

    public static void showInvalidUsernamePrompt() {
        showEmptyLine();
        final String MESSAGE = "Username duplicated, Please enter another username: ";
        System.out.print(MESSAGE);
    }

    public static void showInvalidPasswordPrompt() {
        showEmptyLine();
        final String MESSAGE = "Password too short, Please enter another password: ";
        System.out.print(MESSAGE);
    }

    public static void showLoginResults(Boolean isLoginSuccess) {
        final String MESSAGE = isLoginSuccess ? "Login successfully."
                : "Username or Password not correct. Please try again.";
        showStandardOutput(INDENTATION + MESSAGE);
    }

    public static void showStandardOutput(String output) {
        printSplitLine();
        System.out.println();
        System.out.println(output);
        printSplitLine();
        System.out.println();
    }

    public static void showEmptyLine() {
        System.out.println();
    }

    private static void printSplitLine() {
        System.out.println(INDENTATION + "____________________________________________________________");
    }
}