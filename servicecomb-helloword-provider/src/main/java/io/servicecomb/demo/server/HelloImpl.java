
package io.servicecomb.demo.server;

import io.servicecomb.demo.Hello;

public class HelloImpl implements Hello {

    @Override
    public String sayHi(String name) {
        return "Hello " + name;
    }

}
