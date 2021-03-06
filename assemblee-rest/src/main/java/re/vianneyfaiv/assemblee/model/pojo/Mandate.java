package re.vianneyfaiv.assemblee.model.pojo;

import java.util.Date;

public class Mandate {

    private String mandateId;
    private Date startDate;
    private Date endDate;
    private String politicalBodyId;
    private PoliticalBodyType politicalBodyType;
    private String politicalBodyLabel;
    private int legislature;
    private String cause;
    private String quality;

    public Mandate() {
    }

    public Mandate(PoliticalBodyMemberRow row) {
        this.mandateId = row.getMandateId();
        this.startDate = row.getStartDate();
        this.endDate = row.getEndDate();
        this.politicalBodyId = row.getPoliticalBodyId();
        this.politicalBodyType = row.getPoliticalBodyType();
        this.politicalBodyLabel = row.getPoliticalBodyLabel();
        this.legislature = row.getLegislature();
        this.cause = row.getCause();
        this.quality = row.getQuality();
    }

    public String getMandateId() {
        return mandateId;
    }

    public void setMandateId(String mandateId) {
        this.mandateId = mandateId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPoliticalBodyId() {
        return politicalBodyId;
    }

    public void setPoliticalBodyId(String politicalBodyId) {
        this.politicalBodyId = politicalBodyId;
    }

    public PoliticalBodyType getPoliticalBodyType() {
        return politicalBodyType;
    }

    public void setPoliticalBodyType(String politicalBodyType) {
        this.politicalBodyType = PoliticalBodyType.fromCode(politicalBodyType);
    }

    public String getPoliticalBodyLabel() {
        return politicalBodyLabel;
    }

    public void setPoliticalBodyLabel(String politicalBodyLabel) {
        this.politicalBodyLabel = politicalBodyLabel;
    }

    public int getLegislature() {
        return legislature;
    }

    public String getCause() {
        return cause;
    }

    public void setLegislature(int legislature) {
        this.legislature = legislature;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
