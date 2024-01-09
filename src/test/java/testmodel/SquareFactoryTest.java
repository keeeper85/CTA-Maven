package testmodel;

import org.example.model.Square;
import org.example.model.SquareFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareFactoryTest {

    @Test
    public void createYellowSquares(){
        List<Square> list = SquareFactory.createYellowSquares(10);
        int result = list.size();
        assertEquals(10,result);
    }
}
