
/**
 * Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
 * которых есть параметры, например <p id=”p1”>, и замену их на простые теги
 * абзацев <p>.
 */
public class Task23_FindParagraphTags {
    public static void main(String[] args) {
        String text = "</div> Написать программу, выполняющую поиск </div>\n" +
                "</p> в строке всех тегов </p> абзацев, <p id=”jgib”> в т.ч. тех, у </p id=”p251”>\n" +
                "<p id=”p1”> которых <p style=”text-align:right”> есть параметры, например <p id=”p1”>, и замену их </div>\n" +
                "<div> на простые теги абзацев <p>.";
        System.out.println(text.replaceAll("<p.*?>|</p.*?>|</div.*?>|<div.*?>", "<p>"));
    }
}

