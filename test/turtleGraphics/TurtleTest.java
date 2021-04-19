package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {
    Pen pen;
    Pen secondPen;
    Turtle turtle;
    @BeforeEach
    void beforeEachTest(){
       pen = new Pen();
       Pen secondPen = new Pen();
       turtle = new Turtle(pen);
    }
    @Test
    void turtleHasAPenTest(){
        assertNotNull(turtle.getPen());
        assertEquals ( pen, turtle.getPen () );
        assertNotEquals ( secondPen, turtle.getPen () );
    }

    @Test
    void turtleCanMovePenUp(){

        turtle.movePenUp();
        assertTrue (turtle.isPenUp());

    }

    @Test
    void turtleCanMovePenDown(){
        assertTrue ( turtle.isPenUp () );
        turtle.movePenDown();
        assertTrue ( !turtle.isPenUp () );
    }

    @Test
    void turtleCanTurnRightWhenFacingEast(){
        assertSame (EAST, turtle.getCurrentDirection());
        turtle.turnRight();

        assertSame ( SOUTH, turtle.getCurrentDirection () );
    }

    @Test
    void turtleCanTurnRightWhenFacingSouth(){
        turtle.turnRight();
        assertSame ( SOUTH, turtle.getCurrentDirection () );
        turtle.turnRight();
        assertSame ( WEST, turtle.getCurrentDirection () );
    }

    @Test
    void turtleCanTurnRightWhenFacingWest(){
        turtle.turnRight();
        turtle.turnRight();
        assertSame ( WEST, turtle.getCurrentDirection () );
        turtle.turnRight();
        assertSame ( NORTH, turtle.getCurrentDirection () );

    }

    @Test
    void turtleCanTurnRightWhenFacingNorth(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame ( NORTH, turtle.getCurrentDirection () );
        turtle.turnRight();
        assertSame ( EAST, turtle.getCurrentDirection () );

    }

    @Test
    void turtleCanTurnLeftWhenFacingEast(){
        assertSame (EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame ( NORTH, turtle.getCurrentDirection () );
    }

    @Test
    void turtleCanTurnLeftWhenFacingNorth(){
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame ( WEST, turtle.getCurrentDirection () );
    }

    @Test
    void turtleCanTurnLeftWhenFacingWest(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame ( SOUTH, turtle.getCurrentDirection () );
    }

    @Test
    void turtleCanTurnLeftWhenFacingSouth(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame ( EAST, turtle.getCurrentDirection () );
    }

    @Test
    void turtleCanMoveForwardFacingEast(){
        assertSame ( EAST, turtle.getCurrentDirection () );

        turtle.moveForwardBy(5);
        assertEquals ( new Position(0,4), turtle.getCurrentPosition() );
    }

    @Test
    void turtleCanMoveForwardFacingSouth(){
        turtle.moveForwardBy(5);
        turtle.turnRight();
        turtle.moveForwardBy(5);
        assertEquals ( new Position(4,4), turtle.getCurrentPosition() );
    }

    @Test
    void turtleCanMoveForwardFacingWest(){
        turtle.moveForwardBy(5);
        turtle.turnRight();
        turtle.moveForwardBy(5);
        turtle.turnRight();
        turtle.moveForwardBy(5);
        assertEquals ( new Position(4,0), turtle.getCurrentPosition() );
    }

    @Test
    void turtleCanMoveForwardFacingNorth(){
        turtle.moveForwardBy(5);
        turtle.turnRight();
        turtle.moveForwardBy(5);
        turtle.turnRight();
        turtle.moveForwardBy(5);
        turtle.turnRight();
        turtle.moveForwardBy(5);
        assertEquals ( new Position(0,0), turtle.getCurrentPosition() );
    }

    @Test
    void turtleCanWriteWhileFacingEastTest(){
        turtle.movePenDown ();
        SketchPad sketchPad = new SketchPad(20,20);
        int numberOfSteps = 5;
        turtle.writeOn(sketchPad, numberOfSteps );
        int counter = 0;
        int [][] floor = sketchPad.getFloor ();
        while (counter < numberOfSteps){
            assertEquals ( 1,floor[0][counter]);
            counter++;
        }
    assertEquals ( new Position(0,4), turtle.getCurrentPosition () );
    }


    @Test
    void turtleCanWriteWhileFacingSouthTest(){
        turtle.turnRight ();
        turtle.movePenDown ();
        SketchPad sketchPad = new SketchPad(20,20);
        int numberOfSteps = 5;
        turtle.writeOn(sketchPad, numberOfSteps);
        int counter = 0;
        int [][] floor = sketchPad.getFloor ();
        while (counter < numberOfSteps){
            assertEquals ( 1,floor[0][counter]);
            counter++;
        }
        assertEquals ( new Position(4,0), turtle.getCurrentPosition () );

    }

    @Test
    void turtleCanWriteWhileFacingWestTest(){
        turtle.turnRight ();
        turtle.movePenUp ();
        turtle.turnLeft ();
        turtle.movePenDown ();
        SketchPad sketchPad = new SketchPad(20,20);
        int numberOfSteps = 5;
        turtle.writeOn(sketchPad, numberOfSteps);
        int counter = 0;
        int [][] floor = sketchPad.getFloor ();
        while (counter < numberOfSteps){
            assertEquals ( 1,floor[0][counter]);
            counter++;
        }
        assertEquals ( new Position(0,4), turtle.getCurrentPosition () );

    }

    @Test
    void turtleCanWriteWhileFacingNorthTest(){
        turtle.turnRight ();
        turtle.movePenUp ();
        turtle.turnLeft ();
        turtle.turnRight ();
        turtle.movePenDown ();
        SketchPad sketchPad = new SketchPad(20,20);
        int numberOfSteps = 5;
        turtle.writeOn (sketchPad, numberOfSteps);
        int counter = 0;
        int [][] floor = sketchPad.getFloor ();
        while (counter < numberOfSteps){
            assertEquals ( 1,floor[0][counter]);
            counter++;
        }
        assertEquals ( new Position(4,0), turtle.getCurrentPosition () );

    }

}
