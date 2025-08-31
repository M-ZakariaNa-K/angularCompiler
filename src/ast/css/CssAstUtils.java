package ast.css;

import java.util.Iterator;

public final class CssAstUtils {
    private CssAstUtils() {}

    public static String joinWithSpace(Iterable<String> parts) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = parts.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) sb.append(' ');
        }
        return sb.toString();
    }

    public static String joinWithCommaSpace(Iterable<String> parts) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = parts.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) sb.append(", ");
        }
        return sb.toString();
    }
}
