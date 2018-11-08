package player;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @auther Rasmus Sander Larsen
 * @date 07-11-2018
 */
public class PlayerTest {

    @Test
    public void updateScore() {

        final int STARTINGSCORE=1000, EXTRAPOINT = 500;

        Player player1 = new Player("test",STARTINGSCORE);
        player1.updateScore(EXTRAPOINT);
        assertEquals(STARTINGSCORE+EXTRAPOINT,player1.getAccount());

    }

    @Test
    public void resetScore() {
        final int STARTINGSCORE=1000;
        Player player1 = new Player("test",STARTINGSCORE);
        player1.resetScore();
        assertEquals(0,player1.getAccount().getBalance());
    }

    @Test
    public void getAccount() {

        final int STARTINGSCORE=1000;
        Player player1 = new Player("test",STARTINGSCORE);
        assertEquals(STARTINGSCORE,player1.getAccount());

    }

    @Test
    public void setAccount() {
        final int STARTINGSCORE=1000;
        final int SETTEDSCORE = 9999;
        Player player1 = new Player("test",STARTINGSCORE);
        Account account = new Account(SETTEDSCORE);
        player1.setAccount(account);
        assertEquals(SETTEDSCORE,player1.getAccount());
    }

    @Test
    public void getName() {
        final int STARTINGSCORE=1000;
        final String NAME = "test";
        Player player1 = new Player(NAME,STARTINGSCORE);
        assertEquals(NAME,player1.getName());

    }

    @Test
    public void setName() {
        final int STARTINGSCORE=1000;
        final String NAME = "test";
        final String SETTEDNAME = "Setted name";
        Player player1 = new Player(NAME,STARTINGSCORE);
        player1.setName(SETTEDNAME);

    }

    @Test
    public void isHasWon() {

        final int STARTINGSCORE=9999;
        final String NAME = "test";
        Player player1 = new Player(NAME,STARTINGSCORE);
        assertEquals(true,player1.isHasWon());

    }

    @Test
    public void setHasWon() {

        final int STARTINGSCORE=1000;
        final String name = "test";
        Player player1 = new Player(name,STARTINGSCORE);
        assertEquals(false,player1.isHasWon());
        player1.setHasWon(true);
        assertEquals(true, player1.isHasWon());
    }
    
}