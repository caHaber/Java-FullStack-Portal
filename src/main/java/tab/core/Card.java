package tab.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Card {
    @JsonProperty
    private String displayName;

    @JsonProperty
    private String URLstring;

    public Card() {
        // Jackson deserialization
    }

    public Card( String displayName, String displayRole) {

        this.displayName = displayName;
        this.URLstring = displayRole;
    }


    public String getDisplayName() {
        return displayName;
    }

    public String getDisplayRole() {
        return URLstring;
    }
}
