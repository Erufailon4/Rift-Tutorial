package com.erufailon4.tutorialmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import org.dimdev.rift.listener.BlockAdder;
import org.dimdev.rift.listener.ItemAdder;

public class TutorialMod implements ItemAdder, BlockAdder {

    public static final Item COPPER_INGOT = new Item(new Item.Builder().group(ItemGroup.MATERIALS));

    public static final Block COPPER_ORE = new Block(Block.Builder.create(Material.ROCK, MapColor.STONE).hardnessAndResistance(3.0F, 3.0F));

    @Override
    public void registerItems() {
        Item.registerItem("tutorialmod:copper_ingot", COPPER_INGOT);
        Item.register(COPPER_ORE, ItemGroup.BUILDING_BLOCKS);
    }

    @Override
    public void registerBlocks() {
        Block.register("tutorialmod:copper_ore", COPPER_ORE);
    }
}
