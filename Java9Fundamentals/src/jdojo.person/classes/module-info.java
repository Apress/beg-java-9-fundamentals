// module-info.java
module jdojo.person {
    // Read the jdojo.address module
    requires transitive jdojo.address;
    
    // Export the com.jdojo.person package
    exports com.jdojo.person;
}
