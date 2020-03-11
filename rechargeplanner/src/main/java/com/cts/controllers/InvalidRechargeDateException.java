package com.cts.controllers;

public class InvalidRechargeDateException extends RuntimeException {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public InvalidRechargeDateException(String desc)
		{
			super(desc);
		}
}
