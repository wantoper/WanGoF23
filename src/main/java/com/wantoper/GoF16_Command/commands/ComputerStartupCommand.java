package com.wantoper.GoF16_Command.commands;

import com.wantoper.GoF16_Command.devices.Computer;

public class ComputerStartupCommand extends Command{
    private Computer computer;

    public ComputerStartupCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        this.computer.startup();
    }
}
