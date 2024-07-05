package com.simo.transaction.service;

import com.simo.transaction.mapper.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemMapper itemMapper;

    public void test() {
        System.out.println("test");
    }
}
