package com.ihamen.Commands.CellingFan;

import com.ihamen.Commands.Command;
import com.ihamen.Devices.CellingFan;

public abstract class CellingFanCommand implements Command {
    protected CellingFan cellingFan;
    protected int speed;

    public CellingFanCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    public void execute(){}

    @Override
    public void undo() {
        if (speed==cellingFan.HIGH){
            cellingFan.setHigh();
            return;
        }

        if (speed==cellingFan.MEDIUM){
            cellingFan.setMedium();
            return;
        }

        if (speed==cellingFan.LOW){
            cellingFan.setLow();
            return;
        }

        if (speed==cellingFan.OFF){
            cellingFan.powerOff();
            return;
        }
    }
}
