package com.tong.headFirst.command;

import com.tong.headFirst.command.simple.Command;
import com.tong.headFirst.command.simple.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
