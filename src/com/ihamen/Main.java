package com.ihamen;

import com.ihamen.Commands.*;
import com.ihamen.Commands.CellingFan.CellingFanHighCommand;
import com.ihamen.Commands.CellingFan.CellingFanLowCommand;
import com.ihamen.Commands.CellingFan.CellingFanMediumCommand;
import com.ihamen.Commands.CellingFan.CellingFanOffCommand;
import com.ihamen.Commands.Television.TvPowerOffCommand;
import com.ihamen.Commands.Television.TvPowerOnCommand;
import com.ihamen.Devices.CellingFan;
import com.ihamen.Devices.Television;
import com.ihamen.Invokers.RemoteControl;

public class Main {
    static RemoteControl remoteControl;

    public static void main(String[] args) {

        initialization();
        System.out.println("Testing all buttons!");
        System.out.println(remoteControl);
        allButtonsTest();

        System.out.println("\n");
        System.out.println("Testing undo buttons!");
        undoButtonTest();
        System.out.println(remoteControl);

        System.out.println("Testing macro command!");
        macroCommandTest();



    }

    private static void initialization(){

        remoteControl = new RemoteControl();
        CellingFan cellingFan = new CellingFan();
        Television television = new Television();

        CellingFanHighCommand cellingFanHighCommand = new CellingFanHighCommand(cellingFan);
        CellingFanMediumCommand cellingFanMediumCommand = new CellingFanMediumCommand(cellingFan);
        CellingFanLowCommand cellingFanLowCommand = new CellingFanLowCommand(cellingFan);
        CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(cellingFan);

        TvPowerOnCommand tvPowerOnCommand = new TvPowerOnCommand(television);
        TvPowerOffCommand tvPowerOffCommand = new TvPowerOffCommand(television);

        MacroCommand setHighFanOnTv = new MacroCommand(new CellingFanHighCommand(cellingFan),new TvPowerOnCommand(television));
        MacroCommand offTvAndFan = new MacroCommand(new TvPowerOffCommand(television),new CellingFanOffCommand(cellingFan));

        remoteControl.setCommand(0, cellingFanHighCommand, cellingFanOffCommand);
        remoteControl.setCommand(1, cellingFanMediumCommand, cellingFanOffCommand);
        remoteControl.setCommand(2, cellingFanLowCommand, cellingFanOffCommand);
        remoteControl.setCommand(3, tvPowerOnCommand, tvPowerOffCommand);
        remoteControl.setCommand(4,setHighFanOnTv,offTvAndFan);
    }

    private static void allButtonsTest(){
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }

    private static void undoButtonTest(){
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.undoCommandWasPushed();
    }

    private static void macroCommandTest(){
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
    }
}
