package org.APCSLowell;

public class StepTracker {
    private int totalSteps;
    private int totalDays;
    private int totalDaysActive;
    private int minActive;

    public StepTracker(int activityThreshold) {
        minActive = activityThreshold;
        totalSteps = totalDays = totalDaysActive = 0;
    }
    public void addDailySteps(int stepCount) {
        totalSteps += stepCount;
        totalDays++;
        if (stepCount >= minActive) {
            totalDaysActive++;
        }
    }
    public int activeDays() {
        return totalDaysActive;
    }
    public double averageSteps() {
        if (totalDays == 0) {
            return 0.0;
        }
        return (double) totalSteps / totalDays;
    }
}
