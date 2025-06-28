package com.wantoper.GoF16_Command;
import com.wantoper.GoF16_Command.commands.ComputerPoweroffCommand;
import com.wantoper.GoF16_Command.commands.ComputerStartupCommand;
import com.wantoper.GoF16_Command.devices.Computer;

public class GoF16_Main {
    public static void main(String[] args) {
        //也可以设计一种Map结构的panel        "poweroff":ComputerPoweroffCommand
        CommandPanel commandPanel = new CommandPanel();
        Computer computer = new Computer();
        commandPanel.addCommand(new ComputerPoweroffCommand(computer));
        commandPanel.addCommand(new ComputerStartupCommand(computer));
        commandPanel.run();
    }
}