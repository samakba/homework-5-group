package use_case.logout;

import use_case.login.LoginUserDataAccessInterface;

/**
 * The Logout Interactor.
 */
public class LogoutInteractor implements LogoutInputBoundary {

    private final LoginUserDataAccessInterface userDataAccessObject;
    private final LogoutOutputBoundary logoutPresenter;

    public LogoutInteractor(LoginUserDataAccessInterface userDataAccessInterface,
                            LogoutOutputBoundary logoutOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.logoutPresenter = logoutOutputBoundary;
    }

    @Override
    public void execute(LogoutInputData logoutInputData) {
        final String usernameToLogout = logoutInputData.retrieveUsername();

        // Log out the user by clearing the current username
        userDataAccessObject.setCurrentUsername(null);

        final LogoutOutputData logoutResult = new LogoutOutputData(usernameToLogout, true);

        logoutPresenter.prepareSuccessView(logoutResult);
    }
}
