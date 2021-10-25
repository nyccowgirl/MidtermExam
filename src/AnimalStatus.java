public enum AnimalStatus {
    NEW("New and being evaluated", false),
    SHORT_TERM("Short-term resident", true),
    LONG_TERM("Long-term resident", false);

    private String display;
    private boolean eligibleForAdoption;

    AnimalStatus(String display, boolean eligibleForAdoption) {
        this.display = display;
        this.eligibleForAdoption = eligibleForAdoption;
    }

    public String getDisplay() {
        return display;
    }

    public boolean isEligibleForAdoption() {
        return eligibleForAdoption;
    }
}
