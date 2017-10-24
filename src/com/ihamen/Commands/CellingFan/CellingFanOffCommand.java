package com.ihamen.Commands.CellingFan;

import com.ihamen.Devices.CellingFan;

public class CellingFanOffCommand extends CellingFanCommand {
    public CellingFanOffCommand(CellingFan cellingFan) {
        super(cellingFan);
    }

    @Override
    public void execute() {
        speed = cellingFan.getSpeed();
        cellingFan.powerOff();
    }

    @Override
    public void undo() {
        super.undo();
    }
}
