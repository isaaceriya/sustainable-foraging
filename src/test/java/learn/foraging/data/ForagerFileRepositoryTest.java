package learn.foraging.data;

import learn.foraging.models.Category;
import learn.foraging.models.Forage;
import learn.foraging.models.Forager;
import learn.foraging.models.Item;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForagerFileRepositoryTest {


    @Test
    void shouldFindAll() {
        ForagerFileRepository repo = new ForagerFileRepository("./data/foragers.csv");
        List<Forager> all = repo.findAll();
        assertEquals(1000, all.size());
    }

    /*@Test
    void shouldAdd() throws DataException {
        ForagerFileRepository repo = new ForagerFileRepository("./data/foragers.csv");
        Forager expected = new Forager();
        expected.setFirstName("Test");
        expected.setLastName("Testing");
        expected.setState("CA");



        Forager forager = new Forager();
        forager.setFirstName("Test");
        forager.setLastName("Testing");
        forager.setState("CA");

        Forager actual = repo.add(forager);


        assertEquals(expected, actual);
    }*/
}