package com.marcel.op_item.items;

import com.marcel.op_item.OP_Item;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OP_Item.MODID);

    public static final RegistryObject<Item> OPSHINE = ITEMS.register("opshine",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_OPSHINE = ITEMS.register("raw_opshine",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
