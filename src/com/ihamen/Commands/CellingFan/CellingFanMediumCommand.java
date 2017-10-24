package com.ihamen.Commands.CellingFan;

import com.ihamen.Devices.CellingFan;

/**
 * Created by stepanenko.sg on 23.10.2017.
 */
public class CellingFanMediumCommand extends CellingFanCommand {
    public CellingFanMediumCommand(CellingFan cellingFan) {
        super(cellingFan);
    }

    @Override
    public void execute() {
        speed = cellingFan.getSpeed();
        cellingFan.setMedium();
    }

    @Override
    public void undo() {
        super.undo();
    }
}
