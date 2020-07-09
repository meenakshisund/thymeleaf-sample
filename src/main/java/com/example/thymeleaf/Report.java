package com.example.thymeleaf;

import java.util.List;

public class Report {

    List<Object> summary;
    List<Object> difference;
    List<Object> missingItems;

    public List<Object> getSummary() {
        return summary;
    }

    public void setSummary(List<Object> summary) {
        this.summary = summary;
    }

    public List<Object> getDifference() {
        return difference;
    }

    public void setDifference(List<Object> difference) {
        this.difference = difference;
    }

    public List<Object> getMissingItems() {
        return missingItems;
    }

    public void setMissingItems(List<Object> missingItems) {
        this.missingItems = missingItems;
    }
}
