package re.vianneyfaiv.assemblee.dao.model;

import java.util.Date;

public class GetPersonDetailsRow {

    private String mandateId;
    private Date startDate;
    private Date endDate;
    private String politicalBodyId;
    private String politicalBodyType;
    private String politicalBodyLabel;

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

    public String getPoliticalBodyType() {
        return politicalBodyType;
    }

    public void setPoliticalBodyType(String politicalBodyType) {
        this.politicalBodyType = politicalBodyType;
    }

    public String getPoliticalBodyLabel() {
        return politicalBodyLabel;
    }

    public void setPoliticalBodyLabel(String politicalBodyLabel) {
        this.politicalBodyLabel = politicalBodyLabel;
    }
}
