package greeting

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class GreetingController {

    @Get(uri="/", produces="text/plain")
    String index() {
        "Welcome, have a nice day! "
    }
}