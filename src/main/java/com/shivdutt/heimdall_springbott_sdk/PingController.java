package com.shivdutt.heimdall;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class PingController {

    @GetMapping("/__ping__")
    public Map<String, Object> ping() {
        System.out.println("Ping received at: " + LocalDateTime.now());

        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        long heapMemoryUsed = memoryBean.getHeapMemoryUsage().getUsed() / (1024 * 1024);

        Map<String, Object> response = new HashMap<>();
        response.put("status", "ok");
        response.put("message", "Ping successful");
        response.put("timestamp", LocalDateTime.now().toString());

        Map<String, Object> memory = new HashMap<>();
        memory.put("heapUsedMB", heapMemoryUsed);
        response.put("memory", memory);

        return response;
    }
}
