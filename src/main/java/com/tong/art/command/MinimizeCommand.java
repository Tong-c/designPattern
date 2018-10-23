package com.tong.art.command;

public class MinimizeCommand extends Command {

    private WindowHandler whObj;

    public MinimizeCommand() {
        whObj = new WindowHandler();
    }

    public void execute() {
        whObj.minimize();
    }
}
