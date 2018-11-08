package game;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * @author Karl Emil Jeppesen
 * StudyID: s180557
 * Date: 08-11-2018
 * University: DTU
 */
public class GameTest {

    GameStub game = new GameStub();

    @Test
    public void launch() {

        String input = "Karl\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        game.launch();

        String mitnavn = Game.navn;

        assertEquals("Karl", mitnavn);



    }
}

//Testing that user can have multiple names
