package com.marcel.op_item.items;

import com.marcel.op_item.OP_Item;
import com.marcel.op_item.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OP_Item.MODID);

    public static final RegistryObject<CreativeModeTab> OP_Tab = CREATIVE_MODE_TABS.register("op_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OPSHINE.get()))
                    .title(Component.translatable("creativetab.op_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.OPSHINE.get());
                        pOutput.accept(ModItems.RAW_OPSHINE.get());

                        pOutput.accept(ModBlocks.OP_Block.get());
                        pOutput.accept(ModBlocks.RAW_OP_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
