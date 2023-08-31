package com.company;

import javax.management.modelmbean.ModelMBean;
import java.awt.*;
import java.sql.Time;

public class TimeManager{
    private static final int SNOOZE_DURATION_IN_MINUTES=2;
    private Time currentTime;
    private Time alarmTime;
    private Time snoozetime;
    private DisplayMode display;
    private ModelMBean modemgr;
    private Alarm alarm;


}
