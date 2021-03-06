package player;

public class Player {

    /*
     --------- Fields ---------------
      */

    private String name;
    private Account account;
    private boolean hasWon = false;

    /*
     ------- Constructors ------------
      */

    /**
     * Default constructor
     */
    public Player ( String name ) {
        // Initialize
        this.name = name;
        account = new Account();
    }

    /**
     * Alternative constructor
     * @param name String
     * @param initialBalance int
     */
    public Player ( String name, int initialBalance ) {
        // Initialize
        this.name = name;
        account = new Account(initialBalance);
    }


    /*
    -------- Public Methods ----------
     */

    /**
     * Updates the players account with the specified amount
     * @param score The amount which is going to the account as an int
     */
    public void updateScore ( int score ) {
        // Update the account associated with the player
        account.update(score);
    }

    public void resetScore () {
        // Set players account to 0
        account.setBalance(0);
    }

    /*
    ------- Support Methods ----------
     */


    /*
     ------ Variable accessible ------
      */

    public Account getAccount()  { return account; }

    public void setAccount(Account account) { this.account = account; }

    public String getName() {
        return name; }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasWon() {
        return hasWon;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }
}
