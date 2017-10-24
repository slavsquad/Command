package com.ihamen.Commands.Television;

import com.ihamen.Commands.Command;
import com.ihamen.Devices.Television;

public class TvPowerOnCommand implements Command {
    private Television television;

    public TvPowerOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.powerOn();
    }

    //Команда Execute включает телевизор, значит команда Undo его должна выключать(у нас всего два сотояния устройства)
    @Override
    public void undo() {
        television.powerOff();
    }
}
