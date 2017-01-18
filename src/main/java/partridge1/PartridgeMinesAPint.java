package partridge1;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.toIntExact;


public final class PartridgeMinesAPint {

    private static final List PARTRIDGE_TERMS =
            Collections.unmodifiableList(Arrays.asList("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad"));

    public static String of(List<String> terms) {
        StringBuilder minesAPint = new StringBuilder("Mine's a Pint");
        long noOfTerms = terms.stream().filter(PARTRIDGE_TERMS::contains).count();
        return noOfTerms > 0 ? minesAPint.append(StringUtils.repeat("!", toIntExact(noOfTerms))).toString() : "Lynn, I've pierced my foot on a spike!!";
    }

}
