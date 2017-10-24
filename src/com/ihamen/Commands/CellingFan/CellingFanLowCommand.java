package com.ihamen.Commands.CellingFan;

import com.ihamen.Devices.CellingFan;

public class CellingFanLowCommand extends CellingFanCommand {
    public CellingFanLowCommand(CellingFan cellingFan) {
        super(cellingFan);
    }

    @Override
    public void execute() {
        speed = cellingFan.getSpeed();
        cellingFan.setLow();
    }

    @Override
    public void undo() {
        super.undo();
    }
}
