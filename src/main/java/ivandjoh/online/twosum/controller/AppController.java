package ivandjoh.online.twosum.controller;

import ivandjoh.online.twosum.http.response.HttpAppResponse;
import ivandjoh.online.twosum.service.impl.AppService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class AppController {

    AppService appService;

    @GetMapping("/")
    public ResponseEntity<HttpAppResponse> apphome() {
        HttpAppResponse response = new HttpAppResponse();
        response.setStatus(200);
        response.setMessage("Welcome to Two Sum App");

        return ResponseEntity.ok(response);
    }

    @PostMapping("/twosum")
    public Integer[] twosum(
            @RequestBody Integer[] nums,
            @RequestBody Integer target
            ) {
        return appService.twoSumImpl(nums,target);
    }
}
