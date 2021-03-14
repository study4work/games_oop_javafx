package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class BishopBlackTest extends TestCase {

    @Test
    public void testPosition() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell cell = Cell.findBy(2,7);
        assertThat(bishop.position(), is(cell));
    }
    @Test
    public void testWayG1toG5() throws ImpossibleMoveException {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] cells = bishop.way(Cell.G5);
        Cell[] actual = new Cell[]{Cell.D2,Cell.E3,Cell.F4,Cell.G5};
        assertArrayEquals(actual,cells);
    }

    @Test
    public void testCopy() {
        Figure bishop = new BishopBlack(Cell.C1);
        Figure dest = bishop.copy(Cell.findBy(6,3));
        Figure bishopDest = new BishopBlack(Cell.G5);
        assertThat(dest.position(), is(bishopDest.position()));
    }
}