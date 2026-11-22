package losky2987.Element;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HtmlStructureTest {

    @Test
    @DisplayName("Test: if html structure correct contained")
    void makeEmptyHtml() {
        String content = "";
        var res = HtmlStructure.makeHtml(content);
        assert(res).contains(HtmlStructure.prefix);
        assert(res).contains(HtmlStructure.suffix);
    }

    @Test
    @DisplayName("Test: if content correct contained")
    void makeSomethingInHtml() {
        String content = "<h1>Title</h1>";
        var res = HtmlStructure.makeHtml(content);
        assert(res).contains(content);
    }
}
