package MainTest;

import org.junit.Assert;
import org.junit.Test;
import springboot.nag.collections.HashSetOperations;

import static org.junit.jupiter.api.Assertions.*;
class MainJunitTest {
    @Test
  public void operations() {

        HashSetOperations hashSetOperations=new HashSetOperations();
        hashSetOperations.testOperations();

    }

}