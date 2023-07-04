package betterbabycarrots.item;

import betterbabycarrots.BetterBabyCarrots;
import betterbabycarrots.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterBabyCarrots.MODID);

    public static final RegistryObject<Item> BABY_CARROT = ITEMS.register("baby_carrot", ()->new Item(new Item.Properties().food(ModFoods.BABY_CARROT)));
    public static final RegistryObject<Item> CHICKPEA = ITEMS.register("chickpea", ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHICKPEA_SEEDS = ITEMS.register("chickpea_seeds", ()->new ItemNameBlockItem(ModBlocks.CHICKPEA_CROP.get(), new Item.Properties()));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
