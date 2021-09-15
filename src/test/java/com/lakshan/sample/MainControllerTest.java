package com.lakshan.sample;

import com.lakshan.sample.controller.MainController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Lakshan
 * @since 9/15/2021 11:27 AM
 */

public class MainControllerTest {

    @Test
    public void getRequestShouldRetunString(){
        MainController mainController = new MainController();
        Assertions.assertEquals("Hello world", mainController.get());
    }
}
