package com.company;


import javax.swing.*;
import javax.swing.Timer;
import java.util.*;
import java.text.SimpleDateFormat;

    class Clock {
        private final JLabel time = new JLabel();
        private final SimpleDateFormat sdf  = new SimpleDateFormat("hh:mm");
        private int   currentSecond;
        private Calendar calendar;

        public static void main( String [] args ) {
            JFrame frame = new JFrame();
            Clock clock = new Clock();
            frame.add( clock.time );
            frame.pack();
            frame.setVisible( true );
            clock.start();
        }
        private void reset(){
            calendar = Calendar.getInstance();
            currentSecond = calendar.get(Calendar.SECOND);
        }
        public void start(){
            reset();
            Timer timer =new Timer (1000,new ActionalListener(){
                
            }
        });
    }


