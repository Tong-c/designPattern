package com.tong.headFirst.command.simple;

import com.tong.headFirst.command.simple.Command;
import com.tong.headFirst.command.simple.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
