package com.wantoper.GoF16_Command.commands;

import com.wantoper.GoF16_Command.devices.Computer;

public class ComputerPoweroffCommand extends Command{
    private Computer computer;

    public ComputerPoweroffCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        this.computer.poweroff();
    }
}
