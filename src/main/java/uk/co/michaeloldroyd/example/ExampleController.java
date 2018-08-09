package uk.co.michaeloldroyd.example;

import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController {
    private static final String RESPONSE_BODY = "Hello World";

    private Logger log;

    public ExampleController(Logger log) {
        this.log = log;
    }

    @RequestMapping("/example1")
    public ResponseEntity<String> exampleRequest() {
        return doRequest();
    }

    @ExampleAnnotation
    @RequestMapping("/example2")
    public ResponseEntity<String> exampleRequestWithAnnotation() {
        return doRequest();
    }

    private ResponseEntity<String> doRequest() {
        log.info("Entering {}", this.getClass());
        return new ResponseEntity<>(RESPONSE_BODY, HttpStatus.OK);
    }
}
