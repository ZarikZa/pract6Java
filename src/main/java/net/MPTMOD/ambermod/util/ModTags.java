package net.MPTMOD.ambermod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.MPTMOD.ambermod.AmberMod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_AMBER_TOOL = tag("needs_amber_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(AmberMod.MOD_ID));
        }
    }

    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(AmberMod.MOD_ID));
        }
    }
}