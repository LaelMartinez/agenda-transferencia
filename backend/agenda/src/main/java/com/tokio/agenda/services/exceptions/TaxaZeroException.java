package com.tokio.agenda.services.exceptions;

public class TaxaZeroException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TaxaZeroException(String message) {
        super(message);
    }
}
