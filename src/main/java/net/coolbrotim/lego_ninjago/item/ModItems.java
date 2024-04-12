package net.coolbrotim.lego_ninjago.item;

import net.coolbrotim.lego_ninjago.LegoNinjagoMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LegoNinjagoMod.MOD_ID);

    public static final RegistryObject<Item> Raw_Tin = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Tin = ITEMS.register("tin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Decompressed_Steel = ITEMS.register("decompressed_steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Steel = ITEMS.register("steel",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
