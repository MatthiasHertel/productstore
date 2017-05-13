package de.mhertel.utility;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by matthias on 13.05.17.
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such Product")  // 404
public class ProductNotFoundException extends RuntimeException {
    // ...
}
