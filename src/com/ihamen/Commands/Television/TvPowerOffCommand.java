package com.ihamen.Commands.Television;

import com.ihamen.Commands.Command;
import com.ihamen.Devices.Television;

public class TvPowerOffCommand implements Command {
    private Television television;

    public TvPowerOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.powerOff();
    }

    //Команда Execute выключает телевизор, значит команда Undo его должна включать (у нас всего два сотояния устройства)
    @Override
    public void undo() {
        television.powerOn();
    }
}
