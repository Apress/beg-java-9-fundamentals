// ResourceTest.java
package com.jdojo.exception;

public class ResourceTest {
    public static void main(String[] args) {
        MyResource r1 = new MyResource(1, false);
        MyResource r2 = new MyResource(2, false);

        try (r1; r2) {
            r1.use();
            r2.use();
            r2.use();
        }

        useResource(new MyResource(3, false));
    }

    public static void useResource(MyResource res) {
        try (res; MyResource res4 = new MyResource(4, false)) {
            res.use();
            res4.use();
        }
    }
}
