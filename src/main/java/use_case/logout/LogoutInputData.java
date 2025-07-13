package use_case.logout;

/**
 * Encapsulates input data for the logout use case.
 */
public class LogoutInputData {

    private final String username;

    public LogoutInputData(String user) {
        // Store the provided username for access by the interactor
        this.username = user;
    }

    /**
     * Returns username of log out.
     *
     * @return the curr username
     */
    public String retrieveUsername() {
        return this.username;
    }

}
