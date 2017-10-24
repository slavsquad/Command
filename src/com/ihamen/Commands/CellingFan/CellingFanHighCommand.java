package com.ihamen.Commands.CellingFan;

import com.ihamen.Devices.CellingFan;

public class CellingFanHighCommand extends CellingFanCommand {

    public CellingFanHighCommand(CellingFan cellingFan) {
        super(cellingFan);
    }

    @Override
    public void execute() {
        speed = cellingFan.getSpeed();
        cellingFan.setHigh();
    }

    @Override
    public void undo() {
        super.undo();
    }
}
