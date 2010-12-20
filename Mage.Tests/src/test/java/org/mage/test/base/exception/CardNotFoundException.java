package org.mage.test.base.exception;

/**
 * Thrown when server couldn't create card with given name.
 *
 * @author nantuko
 */
public class CardNotFoundException extends RuntimeException {
    public CardNotFoundException(String s) {
        super(s);
    }
}
