package com.designPattern.structural.proxy;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) throws IOException {
        //some heavy implementation
        System.out.println("'" + cmd + "' command executed.");
    }
}