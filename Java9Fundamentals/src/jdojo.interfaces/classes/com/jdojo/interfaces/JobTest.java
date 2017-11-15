// JobTest.java
package com.jdojo.interfaces;

public class JobTest {
    public static void main(String[] args) {
        submitJob(Job.EMPTY_JOB);        
    }

    public static void submitJob(Job job) {
        job.runJob();
    }
}
