package net.MPTMOD.ambermod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.MPTMOD.ambermod.AmberMod;
import net.MPTMOD.ambermod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AmberMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AMBER_TAB = CREATIVE_MODE_TABS.register("amber_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMBER.get()))
                    .title(Component.translatable("creativetab.amber_tab"))
                    .displayItems((pParameters, pOutput) ->{
                        pOutput.accept(ModItems.AMBER.get());
                        pOutput.accept(ModItems.RAW_AMBER.get());

                        pOutput.accept(ModBlocks.AMBER_BLOCK.get());
                        pOutput.accept(ModBlocks.AMBER_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_AMBER_ORE.get());

                        pOutput.accept(ModItems.AMBER_SWORD.get());
                        pOutput.accept(ModItems.AMBER_PICKAXE.get());
                        pOutput.accept(ModItems.AMBER_AXE.get());
                        pOutput.accept(ModItems.AMBER_SHOVEL.get());
                        pOutput.accept(ModItems.AMBER_HOE.get());

                        pOutput.accept(ModItems.AMBER_HELMET.get());
                        pOutput.accept(ModItems.AMBER_CHESTPLATE.get());
                        pOutput.accept(ModItems.AMBER_LEGGINGS.get());
                        pOutput.accept(ModItems.AMBER_BOOTS.get());
                    })
                    .build());

    public  static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}