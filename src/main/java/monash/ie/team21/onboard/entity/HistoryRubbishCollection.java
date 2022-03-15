package monash.ie.team21.onboard.entity;

public class HistoryRubbishCollection {
    private Integer id;

    private Integer year;

    private Integer collectedWeight;

    private Integer sortedWeight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getCollectedWeight() {
        return collectedWeight;
    }

    public void setCollectedWeight(Integer collectedWeight) {
        this.collectedWeight = collectedWeight;
    }

    public Integer getSortedWeight() {
        return sortedWeight;
    }

    public void setSortedWeight(Integer sortedWeight) {
        this.sortedWeight = sortedWeight;
    }
}