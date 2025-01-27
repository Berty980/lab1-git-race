package es.unizar.webeng.hello.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 *   This class has the unit tests of the HelloController class. 
 *   Is designed using JUnit5 to compare the results obtained with the results expected with assertions.
 */
class HelloControllerUnitTests {
    /**
     * Variable [controller]
     * takes the value of es.unizar.webeng.hello.controller
     */
    private lateinit var controller: HelloController
    /**
     * The [BeforeEach] annottion is used to signal that the annotated method should
     * be executed before each [Test] 
     */
    @BeforeEach
    /**
     * Declare a function which setup the controller 
     */
    fun setup() {
        controller = HelloController()
    }
    /** 
     * Integration test that calls the function [testMessage]  which create an
     * empty new *mutableMap* of [String] and [Any] (Indicates whether some other
     * object is "equal to" this one). Then calls the function welcome of the 
     * [controller] and assert the result.
     */
    @Test
    fun testMessage() {
        val map = mutableMapOf<String,Any>()
        val view = controller.welcome(map)
        // Compare [view] with the string "welcome"
        assertThat(view).isEqualTo("welcome")
        // Check if the mutable [map] contais the key  "message"
        assertThat(map.containsKey("message")).isTrue
        // Check if the value of the key [message] is equal to "Hello World"
        assertThat(map["message"]).isEqualTo("Hello World")
    }

}
