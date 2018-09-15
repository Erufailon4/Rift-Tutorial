package com.erufailon4.tutorialmod;

import net.minecraft.item.*;
import org.dimdev.rift.listener.ItemAdder;

public class TutorialMod implements ItemAdder {

    public static final Item COPPER_INGOT = new Item(new Item.Builder().group(ItemGroup.MATERIALS));

    @Override
    public void registerItems() {
        Item.registerItem("tutorialmod:copper_ingot", COPPER_INGOT);
    }
}
