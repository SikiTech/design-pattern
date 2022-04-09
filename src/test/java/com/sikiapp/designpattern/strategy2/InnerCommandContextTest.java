package com.sikiapp.designpattern.strategy2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.function.Predicate;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InnerCommandContextTest {

    @Autowired
    private InnerCommandContext context;

    @Test
    public void getInstance() {
        InnerCommand instance = context.getInstance(":q! 123");
        instance.process("hello");

        InnerCommand command = context.getInstance(":reboot 456");
        command.process("world");
    }
}
