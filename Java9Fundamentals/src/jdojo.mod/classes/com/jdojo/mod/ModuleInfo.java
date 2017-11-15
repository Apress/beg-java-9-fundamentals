// ModuleInfo.java
package com.jdojo.mod;

import java.lang.module.ModuleDescriptor;

public class ModuleInfo {
    public static void main(String[] args) {
        // Get the class reference
        Class<ModuleInfo> cls = ModuleInfo.class;

        // Get the module reference
        Module m = cls.getModule();

        if (m.isNamed()) {
            // It is a named module

            // Get the module name
            String name = m.getName();

            // Get the moudle descriptor
            ModuleDescriptor md = m.getDescriptor();

            // Print teh module details
            System.out.println("Module Name: " + name);
            System.out.println("Module is open: " + md.isOpen());
            System.out.println("Module is automatic: " + md.isAutomatic());

        } else {
            // It is an unnamed mdoule
            System.out.println("Unnamed module.");
        }
    }
}
