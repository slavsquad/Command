package com.ihamen.Commands;

/**
 * Created by stepanenko.sg on 23.10.2017.
 */
public interface Command {
    public void execute();
    public void undo();
}
