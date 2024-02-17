package Seminars.Sem7.meteo;

import java.time.LocalDateTime;

public class Adapter implements MeteoSensor {
    public Adapter(ST500Info st500Info) {
        this.st500Info = st500Info;
    }

    ST500Info st500Info;

    @Override
    public int getId() {
        return st500Info.getData().identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) st500Info.getData().temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(st500Info.getData().year(),
                1, st500Info.getData().day()/12,
                1, 1, st500Info.getData().second());
        return dateTime;
    }
}
