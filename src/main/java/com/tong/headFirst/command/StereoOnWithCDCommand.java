package com.tong.headFirst.command;

import com.tong.headFirst.command.simple.Command;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(10);
    }

    public void undo() {
        stereo.off();
    }
}
