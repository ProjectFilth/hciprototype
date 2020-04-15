package com.example.hciprototype;

public class SettingsData {


    public int getFirstLaunch() {
        return firstLaunch;
    }

    public void setFirstLaunch(int firstLaunch) {
        this.firstLaunch = firstLaunch;
    }

    public int getVibrateAlerts() {
        return vibrateAlerts;
    }

    public void setVibrateAlerts(int vibrateAlerts) {
        this.vibrateAlerts = vibrateAlerts;
    }

    public int getSpeakAlerts() {
        return speakAlerts;
    }

    public void setSpeakAlerts(int speakAlerts) {
        this.speakAlerts = speakAlerts;
    }

    public int getStormAlert() {
        return stormAlert;
    }

    public void setStormAlert(int stormAlert) {
        this.stormAlert = stormAlert;
    }

    public int getRainAlert() {
        return rainAlert;
    }

    public void setRainAlert(int rainAlert) {
        this.rainAlert = rainAlert;
    }

    public int getNotificationAlerts() {
        return notificationAlerts;
    }

    public void setNotificationAlerts(int notificationAlerts) {
        this.notificationAlerts = notificationAlerts;
    }

    public int getRainAlertThreshold() {
        return rainAlertThreshold;
    }

    public void setRainAlertThreshold(int rainAlertThreshold) {
        this.rainAlertThreshold = rainAlertThreshold;
    }
    public int getLocationOption() {
        return locationOption;
    }

    public void setLocationOption(int locationOption) {
        this.locationOption = locationOption;
    }
    private int firstLaunch = 0;
    private int vibrateAlerts;
    private int speakAlerts;
    private int stormAlert;
    private int rainAlert;
    private int notificationAlerts;
    private int rainAlertThreshold;
    private int locationOption;
}
