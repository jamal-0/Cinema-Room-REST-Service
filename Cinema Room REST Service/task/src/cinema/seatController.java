package cinema;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class seatController implements ErrorController {
    private final int TOTAL_ROWS = 9, TOTAL_COLUMNS = 9;
    Theatre theatre = new Theatre( TOTAL_ROWS, TOTAL_COLUMNS );

    @GetMapping("/seats")
    public Theatre getAvailableSeats() {
        return theatre;
    }

    @PostMapping("/purchase")
    public ResponseEntity<?> purchaseSeat( @RequestBody Seat seat ) {
        return theatre.purchase( seat );
    }

    @PostMapping("/return")
    public ResponseEntity<?> purchaseSeat( @RequestBody Ticket ticket ) {
        return theatre.refund( ticket );
    }
    
    @PostMapping("/stats")
    public ResponseEntity<?> getStatistics (@RequestParam (value = "password", required = false) String password) {
        return theatre.getStats(password);
    }
}