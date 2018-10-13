/**
* This is package
*/
package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  	/**
	* @param someone
	* its a greet method
 	*
 	*/
  public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
