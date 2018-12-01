package si.netflix;

import lombok.Getter;

@Getter
public enum Question {
    DRAMA_COMEDY("Drama or Comedy", "Drama", "Comedy", "A little bit of both"),
    SCI_FI("Do you like sci-fi or supernatural shows", "Yes", "No"),
    QUES_MORALS("Do you like your character have questionable morals", "No", "Yes"),
    SMALL_PRISON("Small town or prison", "Small Town", "Prison"),
    STRONG_FEMALE("Do you like strong female charaters", "Yes", "No"),
    POLITICS("Politics", "Yes", "No"),
    CAN_GORE("Can you handle gore?","Yes", "No"),
    FRIEND_DYSF("Friend group or dysfunctional family","Friends", "Family"),
    ;

    private final String text;
    private final String[] options;

    Question(String text, String... options) {
        this.text = text;
        this.options = options;
    }
}
