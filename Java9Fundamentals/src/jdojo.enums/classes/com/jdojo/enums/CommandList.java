// CommandList.java
package com.jdojo.enums;

public enum CommandList implements Command {
    RUN {
        @Override
        public void execute() {
            System.out.println("Running...");
        }
    },
    JUMP {
        @Override
        public void execute() {
            System.out.println("Jumping...");
        }
    };

    // Force all constants to implement the execute() method.  
    @Override
    public abstract void execute();
}
