package com.company;

import javax.management.modelmbean.ModelMBean;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Alarm {

    private ModelMBean modeMgr;
    private Time alarmTime;
    private Alarm alarm;
    private static final int SNOOZE_DURATION_IN_MINUTES = 2;
    private Time snoozeTime;
    private LocalTime currentTime;
    private boolean on;

    public void setModeManager(ModelMBean newModeMgr) {
        modeMgr = newModeMgr;
    }

    public void setAlarm(Alarm newAlarm) {
        alarm = newAlarm;
    }


    public void snooze() {
        while (alarm.isOn()) {
            //alarm.off();
            int hour = currentTime.getHour();
            int minute = currentTime.getMinute();
            minute += SNOOZE_DURATION_IN_MINUTES;
            if (minute > 59) {
                minute -= 60;
                ++hour;
            }
            snoozeTime = new Time(hour);
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
