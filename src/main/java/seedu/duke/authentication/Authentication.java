package seedu.duke.authentication;

import seedu.duke.Commands;
import seedu.duke.Currency;
import seedu.duke.InputManager;
import seedu.duke.exception.FinanceException;
import seedu.duke.exception.FinanceException.ExceptionCollection;
import seedu.duke.BasicUi;

public class Authentication {
    public static boolean handleAuthenticationRequest() {
        Boolean isProgramEnd = false;
        try {
            AuthenticationUi.showPromptInfo();
            String userInput = InputManager.receiveInputLine();
            Commands commandType = getCommandType(userInput);
            switch (commandType) {
            case REGISTER:
                RegisterCommand.handleRegister();
                break;
            case LOGIN:
                LoginCommand.handleLogin();
                break;
            case CURRENCIES:
                Currency.exchangeCommands();
                break;
            case BYE:
                isProgramEnd = true;
                BasicUi.showExitMessage();
                break;
            default:
                throw new FinanceException(ExceptionCollection.COMMAND_TYPE_EXCEPTION);
            }
        } catch (FinanceException e) {
            e.handleException();
        }
        return isProgramEnd;
    }

    public static Commands getCommandType(String inputLine) throws FinanceException {
        Commands commandType;
        try {
            commandType = Commands.valueOf(inputLine.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new FinanceException(ExceptionCollection.COMMAND_TYPE_EXCEPTION);
        }
        return commandType;
    }
}