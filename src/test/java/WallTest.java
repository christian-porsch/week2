import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallTest {

    @Test
    @DisplayName("Method should set and get the value of widht")
    void setWidhtGetWidhtTest() {

        // Given
        Wall testWall = new Wall(5, 4);

        // When
        testWall.setWidht(5);
        double actual = testWall.getWidht();

        // Then
        assertEquals(5,actual);

    }

    @Test
    @DisplayName("Method should set and get the value of height")
    void setHeightGetHeightTest() {

        // Given
        Wall testWall = new Wall(-1,-1.5);

        // When
        testWall.setHeight(-1.5);
        double actual = testWall.getHeight();

        // Then
        assertEquals(0, actual);

    }

    @Test
    @DisplayName("Method should multiply value of height and widht and return the result")
    void getArea() {
        // Given
        Wall testWall = new Wall(5,4);

        // When
        double actual = testWall.getArea();

        // Then
        assertEquals(20, actual);

    }
}