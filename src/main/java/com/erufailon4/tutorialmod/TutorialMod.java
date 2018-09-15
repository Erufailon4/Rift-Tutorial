package com.erufailon4.tutorialmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import org.dimdev.rift.listener.BlockAdder;
import org.dimdev.rift.listener.ItemAdder;

public class TutorialMod implements ItemAdder, BlockAdder {

    public static final Item COPPER_INGOT = new Item(new Item.Builder().group(ItemGroup.MATERIALS));

    public static final Block COPPER_ORE = new Block(Block.Builder.create(Material.ROCK));

    @Override
    public void registerItems() {
        Item.registerItem("tutorialmod:copper_ingot", COPPER_INGOT);
    }

    @Override
    public void registerBlocks() {
        Block.register("tutorialmod:copper_ore", COPPER_ORE);
    }
}
