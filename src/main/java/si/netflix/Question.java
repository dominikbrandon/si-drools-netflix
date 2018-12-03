package si.netflix;

import lombok.Getter;

@Getter
public enum Question {
    DRAMA_COMEDY("Drama or Comedy", "Drama", "Comedy", "A little bit of both"),
    SCI_FI("Do you like sci-fi or supernatural shows", "Yes", "No"),
    QUEST_MORALS("Do you like your character have questionable morals", "No", "Yes"),
    SMALL_PRISON("Small town or prison", "Small Town", "Prison"),
    STRONG_FEMALE("Do you like strong female charaters", "Yes", "No"),
    POLITICS("Politics", "Yes", "No"),
    CAN_GORE("Can you handle gore?","Yes", "No"),
    FRIEND_DYSF("Friend group or dysfunctional family","Friends", "Family"),
    BRITISH_CHAR("British charakters?", "No", "Yes"),
    FEEL_CRY("Feel like crying?", "Yes", "No"),
    SELL_DRUGS("Do you like them to sell drugs?","Yes","No"),
    NEED_ACTION("Need action?", "Yes", "No"),
    WORK_HUMOR("Work place humor?", "No", "Yes"),
    FOOTBALL("Do you like football?", "Yes", "No"),
    ROMANCE("Scandalous romance?", "Yes", "No"),
    CRIME_SHOWS("Do you like crime shows?", "Yes", "No"),
    HIGH_SCHOOL("Want to see James Franco & Seth Rogen as high schoolers?", "No", "Yes"),
    ZOMBIES("Do you like zombies?", "Yes", "No"),
    HOSPITALS("Hospitals?", "No", "Yes"),
    TINA_AMY("Tina Fey or Amy Poehler?", "Tina", "Amy"),
    ROOT_CRIMINAL("Do you root for the criminals?", "Yes", "No"),
    METH("Meth?", "Yes", "No"),
    OPTI_CYNIC("Optimistic or cynical?", "Optimistic", "Cynical"),
    VAMP("Vampires?", "Yes", "No"),
    BAR_CAFE("Do you want your NYC friends to hang out at a Bar or Cafe?", "Bar", "Cafe"),
    FOREN_PSYC("Forensics or psychology?", "Forensics", "Psychology");

    private final String text;
    private final String[] options;

    Question(String text, String... options) {
        this.text = text;
        this.options = options;
    }
}
