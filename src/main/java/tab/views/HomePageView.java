package tab.views;

import java.util.List;

import io.dropwizard.views.View;
import tab.core.Card;

public class HomePageView extends View {

    private final String message;
    private final List<Card> cards;

    public HomePageView(String message, List<Card> cards) {
        super("hello.ftl");
        this.message = message;
        this.cards = cards;
    }

    public String getMessage() {
        return message;
    }
    
    public List<Card> getCards() {
        return cards;
    }
}
