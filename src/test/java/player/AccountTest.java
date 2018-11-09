package player;

import game.PointController;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void getBalance() {

        Account setbal = new Account();
        setbal.setBalance(1500);

        assertEquals(1500,setbal.getBalance());
    }

    @Test
    public void setBalance() {
        Account getbal = new Account();
        getbal.setBalance(1500);

        assertEquals(1500,getbal.getBalance());
    }

    @Test
    public void update() {

        Account upda = new Account();
        upda.setBalance(1000);
        upda.update(500);

        assertEquals(1500,upda.getBalance());
    }

    @Test
    public void noNegative() {

        Player player = new Player("jens");
        PointController pc = new PointController();

        player.getAccount().setBalance(0);
        pc.add(player,-250);

        assertEquals(0,player.getAccount().getBalance());
    }


}