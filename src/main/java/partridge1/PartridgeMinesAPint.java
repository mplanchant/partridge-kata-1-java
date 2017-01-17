package partridge1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class PartridgeMinesAPint {

    private static final List PARTRIDGE_TERMS =
            Collections.unmodifiableList(Arrays.asList("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad"));

    public static String of(List<String> terms) {
        StringBuilder minesAPint = new StringBuilder("Mine's a Pint");
        boolean termFound = false;

        for (String term : terms) {
            if (PARTRIDGE_TERMS.contains(term)) {
                termFound = true;
                minesAPint.append("!");
            }
        }

        return termFound ? minesAPint.toString() : "Lynn, I've pierced my foot on a spike!!";
    }

}
