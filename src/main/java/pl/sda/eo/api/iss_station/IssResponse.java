package pl.sda.eo.api.iss_station;

public class IssResponse {
    private double latitude;
    private double longitude;
    private double altitude;
    private int passes;
    private String datetime;
    private long risetime;
    private int duration;

    private IssResponse(double latitude, double longitude, double altitude, int passes, String datetime, long risetime, int duration) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.passes = passes;
        this.datetime = datetime;
        this.risetime = risetime;
        this.duration = duration;
    }

    private double getLatitude() {
        return latitude;
    }

    private void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    private double getLongitude() {
        return longitude;
    }

    private void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    private double getAltitude() {
        return altitude;
    }

    private void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    private int getPasses() {
        return passes;
    }

    private void setPasses(int passes) {
        this.passes = passes;
    }

    private String getDatetime() {
        return datetime;
    }

    private void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    private long getRisetime() {
        return risetime;
    }

    private void setRisetime(long risetime) {
        this.risetime = risetime;
    }

    private int getDuration() {
        return duration;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }
}



