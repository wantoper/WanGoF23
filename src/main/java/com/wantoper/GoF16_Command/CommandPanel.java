package com.wantoper.GoF16_Command;

import com.wantoper.GoF16_Command.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandPanel {
    private List<Command> commands;

    public CommandPanel(){
        commands = new ArrayList<>();
    }

    public void addCommand(Command command){
        commands.add(command);
    }

    public void run(){
        for (Command command : commands) {
            command.execute();
        }
    }
}
