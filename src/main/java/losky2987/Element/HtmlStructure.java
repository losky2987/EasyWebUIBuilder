package losky2987.Element;

public class HtmlStructure {
    static String prefix = "<html>";
    static String suffix = "</html>";

    public static String makeHtml(String content) {
        return prefix + content + suffix;
    }
}
