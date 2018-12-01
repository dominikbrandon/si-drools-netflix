package si.netflix;

import lombok.Getter;

@Getter
public enum Question {
    SI_EASY("Is si easy", "Yes", "No", "Maybe", "MatiGold", "Volkswagen Golf 1.6 TDI-CR 77 kW"),
    ;

    private final String text;
    private final String[] options;

    Question(String text, String... options) {
        this.text = text;
        this.options = options;
    }
}
