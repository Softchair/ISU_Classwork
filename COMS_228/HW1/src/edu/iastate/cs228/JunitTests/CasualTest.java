package edu.iastate.cs228.JunitTests;

import edu.iastate.cs228.hw1.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Camden Fergen
 *
 * Tests the casual cell
 */
class CasualTest {

    public static Town testTown;

    @Test
     void who() {
        TownCell testCell = new Casual(testTown, 1, 1);
        State temp = testCell.who();
        assertEquals(State.CASUAL, temp);
    }

    @Test
    void nextReseller() { //Reseller
        Town testTown = new Town(2, 2); //Setup testing town and cells
        testTown.grid[0][0] = new Reseller(testTown, 0, 0);
        testTown.grid[0][1] = new Empty(testTown, 0, 1);
        testTown.grid[1][0] = new Streamer(testTown, 1, 0);
        testTown.grid[1][1] = new Casual(testTown, 1, 1);

        Town tNew = new Town(2, 2); //Create new town for the next cycle

        TownCell tempTownCell = testTown.getCell(testTown, 1, 1);
        TownCell tempState = tempTownCell.next(testTown);
        assertEquals(State.OUTAGE, tempState.who());
    }

    @Test
    void nextStreamer() { //Streamer
        Town testTown = new Town(2, 2); //Setup testing town and cells
        testTown.grid[0][0] = new Streamer(testTown, 0, 0);
        testTown.grid[0][1] = new Streamer(testTown, 0, 1);
        testTown.grid[1][0] = new Streamer(testTown, 1, 0);
        testTown.grid[1][1] = new Casual(testTown, 1, 1);

        Town tNew = new Town(2, 2); //Create new town for the next cycle

        TownCell tempTownCell = testTown.getCell(testTown, 1, 1);
        TownCell tempState = tempTownCell.next(testTown);
        assertEquals(State.STREAMER, tempState.who());
    }

    @Test
    void nextEmptyOutage() { //Empty + Outage
        Town testTown = new Town(2, 2); //Setup testing town and cells
        testTown.grid[0][0] = new Outage(testTown, 0, 0);
        testTown.grid[0][1] = new Casual(testTown, 0, 1);
        testTown.grid[1][0] = new Casual(testTown, 1, 0);
        testTown.grid[1][1] = new Casual(testTown, 1, 1);

        Town tNew = new Town(2, 2); //Create new town for the next cycle

        TownCell tempTownCell = testTown.getCell(testTown, 1, 1);
        TownCell tempState = tempTownCell.next(testTown);
        assertEquals(State.RESELLER, tempState.who());
    }

    @Test
    void nextCasual() { //Casual
        Town testTown = new Town(3, 3); //Setup testing town and cells
        testTown.grid[0][0] = new Casual(testTown, 0, 0);
        testTown.grid[0][1] = new Empty(testTown, 0, 1);
        testTown.grid[0][2] = new Casual(testTown, 0, 2);
        testTown.grid[1][0] = new Casual(testTown, 1, 0);
        testTown.grid[1][1] = new Casual(testTown, 1, 1);
        testTown.grid[1][2] = new Casual(testTown, 1, 2);
        testTown.grid[2][0] = new Casual(testTown, 2, 0);
        testTown.grid[2][1] = new Outage(testTown, 2, 1);
        testTown.grid[2][2] = new Casual(testTown, 2, 2);

        Town tNew = new Town(3, 3); //Create new town for the next cycle

        TownCell tempTownCell = testTown.getCell(testTown, 1, 1);
        TownCell tempState = tempTownCell.next(testTown);
        assertEquals(State.STREAMER, tempState.who());
    }

    @Test
    void nextBase() { //Base case
        Town testTown = new Town(2, 2); //Setup testing town and cells
        testTown.grid[0][0] = new Outage(testTown, 0, 0);
        testTown.grid[0][1] = new Empty(testTown, 0, 1);
        testTown.grid[1][0] = new Empty(testTown, 1, 0);
        testTown.grid[1][1] = new Casual(testTown, 1, 1);

        Town tNew = new Town(2, 2); //Create new town for the next cycle

        TownCell tempTownCell = testTown.getCell(testTown, 1, 1);
        TownCell tempState = tempTownCell.next(testTown);
        assertEquals(State.CASUAL, tempState.who());
    }

}