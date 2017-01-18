package partridge1;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PartridgeMinesAPintTest {

    private static final List<String> EMPTY_LIST = Collections.emptyList();
    private static final List<String> NO_PARTRIDGE_TERMS = Arrays.asList("BLUE", "RED", "PINK", "GREEN");
    private static final List<String> ALL_THE_PARTRIDGE_TERMS
            = Arrays.asList("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad");

    @Test
    public void testEmptyList() throws Exception {
        assertThat(PartridgeMinesAPint.of(EMPTY_LIST))
                .isEqualTo("Lynn, I've pierced my foot on a spike!!");
    }

    @Test
    public void testNoPartridgeTerms() throws Exception {
        assertThat(PartridgeMinesAPint.of(NO_PARTRIDGE_TERMS))
                .isEqualTo("Lynn, I've pierced my foot on a spike!!");
    }

    @Test
    public void testSingleTerm() throws Exception {
        assertThat(PartridgeMinesAPint.of(Collections.singletonList("Lynn")))
                .endsWith("!")
                .doesNotEndWith("!!");
    }

    @Test
    public void testTwoTerms() throws Exception {
        assertThat(PartridgeMinesAPint.of(Arrays.asList("Lynn", "PearTree")))
                .endsWith("!!")
                .doesNotEndWith("!!!");
    }

    @Test
    public void testTwoLynns() throws Exception {
        assertThat(PartridgeMinesAPint.of(Arrays.asList("Lynn", "Lynn")))
                .endsWith("!!")
                .doesNotEndWith("!!!");
    }

    @Test
    public void testThreeTerms() throws Exception {
        assertThat(PartridgeMinesAPint.of(Arrays.asList("Partridge", "PearTree", "Chat")))
                .endsWith("!!!")
                .doesNotEndWith("!!!!");
    }

    @Test
    public void testAllTheTerms() throws Exception {
        assertThat(PartridgeMinesAPint.of(ALL_THE_PARTRIDGE_TERMS))
                .endsWith("!!!!!!!!")
                .doesNotEndWith("!!!!!!!!!");
    }
}