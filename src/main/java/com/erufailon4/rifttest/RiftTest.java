package com.erufailon4.rifttest;

import net.minecraft.item.*;
import org.dimdev.rift.listener.ItemAdder;

public class RiftTest implements ItemAdder {

    public static final Item COPPER_INGOT = new Item(new Item.Builder().group(ItemGroup.MATERIALS));

    @Override
    public void registerItems() {
        Item.registerItem("rifttest:copper_ingot", COPPER_INGOT);
    }
}
