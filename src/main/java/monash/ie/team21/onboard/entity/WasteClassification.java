package monash.ie.team21.onboard.entity;

public class WasteClassification {
    private Integer wasteId;

    private String wasteName;

    private String wasteType;

    public Integer getWasteId() {
        return wasteId;
    }

    public void setWasteId(Integer wasteId) {
        this.wasteId = wasteId;
    }

    public String getWasteName() {
        return wasteName;
    }

    public void setWasteName(String wasteName) {
        this.wasteName = wasteName == null ? null : wasteName.trim();
    }

    public String getWasteType() {
        return wasteType;
    }

    public void setWasteType(String wasteType) {
        this.wasteType = wasteType == null ? null : wasteType.trim();
    }
}