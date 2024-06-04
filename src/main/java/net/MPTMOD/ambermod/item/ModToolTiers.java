package net.MPTMOD.ambermod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.MPTMOD.ambermod.AmberMod;
import net.MPTMOD.ambermod.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier AMBER = TierSortingRegistry.registerTier(
            new ForgeTier(2,250,6f,2f,14,
                    ModTags.Blocks.NEEDS_AMBER_TOOL, () -> Ingredient.of(ModItems.AMBER.get())),
            new ResourceLocation(AmberMod.MOD_ID, "amber"), List.of(Tiers.IRON), List.of());

}
