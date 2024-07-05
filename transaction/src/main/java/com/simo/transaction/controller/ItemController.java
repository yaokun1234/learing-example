package com.simo.transaction.controller;




import com.simo.transaction.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/test")
    public void test() {
        itemService.test();
    }


}
