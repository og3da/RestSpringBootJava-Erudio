package br.com.og3da.demo.exceptions;

import java.util.Date;

public record ExceptionResponse(Date date, String msg, String details) {
}
