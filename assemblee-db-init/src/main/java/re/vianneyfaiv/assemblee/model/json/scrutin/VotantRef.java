package re.vianneyfaiv.assemblee.model.json.scrutin;

public class VotantRef {

    // If you want to add/remove fields in that class, be sure to also edit VotantsWrapperDeserializer.java

    private String acteurRef;
    private String mandatRef;
    private String causePositionVote;

    public String getActeurRef() {
        return acteurRef;
    }

    public String getMandatRef() {
        return mandatRef;
    }

    public void setActeurRef(String acteurRef) {
        this.acteurRef = acteurRef;
    }

    public void setMandatRef(String mandatRef) {
        this.mandatRef = mandatRef;
    }

    public String getCausePositionVote() {
        return causePositionVote;
    }

    public void setCausePositionVote(String causePositionVote) {
        this.causePositionVote = causePositionVote;
    }
}
