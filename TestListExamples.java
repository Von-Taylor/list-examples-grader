import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

class Checker implements StringChecker {
  public boolean checkString(String s) {
      return s.contains("nana");
  }
}

public class TestListExamples {
  // Write your grading tests here!
  @Test
  public void testFilter() {
    List<String> input1 = new ArrayList<>();
    StringChecker sc = new Checker();

    String[] tempInput1 = {"banana", "benerner", "manana", "zenana", "flonp"};
    for(String s: tempInput1) { input1.add(s); }
    
    List<String> expect1 = new ArrayList<>();

    String[] tempExpect1 = {"banana", "manana", "zenana",};
    for(String s: tempExpect1) { expect1.add(s); }

    assertEquals(expect1, ListExamples.filter(input1, sc));
}

@Test
public void testMerge() {

    List<String> input1Array1 = new ArrayList<>();
    String[] tempInput1Array1 = {"apple","cat","eden","golf","idiom"};
    for(String s: tempInput1Array1) { input1Array1.add(s); }
    
    List<String> input1Array2 = new ArrayList<>();
    String[] tempInput1Array2 = {"bat","dandelion","falcon","happy","kite","mop","television"};
    for(String s: tempInput1Array2) { input1Array2.add(s); }

    List<String> expect1 = new ArrayList<>();
    String[] tempExpect1 = {"apple","bat","cat","dandelion","eden","falcon","golf","happy","idiom","kite","mop","television"};
    for(String s: tempExpect1) { expect1.add(s); }

    assertEquals(expect1, ListExamples.merge(input1Array1, input1Array2));
  }
}
