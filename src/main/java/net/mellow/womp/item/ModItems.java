package net.mellow.womp.item;

import net.mellow.womp.WompCraft;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WompCraft.MOD_ID);

    public static final RegistryObject<Item> ORB_HELMET = ITEMS.register("orb_helmet",
            () -> new ArmorItem(ModArmorMaterials.ORBARM, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> ORB_CHESTPLATE = ITEMS.register("orb_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ORBARM, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> ORB_LEGGINGS = ITEMS.register("orb_leggings",
            () -> new ArmorItem(ModArmorMaterials.ORBARM, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> ORB_BOOTS = ITEMS.register("orb_boots",
            () -> new ArmorItem(ModArmorMaterials.ORBARM, ArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> ALFREDO = ITEMS.register("alfredo",
            () -> new Item(new Item.Properties().food(ModFoods.ALFREDO)));

    public static final RegistryObject<Item> SHRIMPAL = ITEMS.register("shrimpal",
            () -> new Item(new Item.Properties().food(ModFoods.SHRIMPAL)));

    public static final RegistryObject<Item> CHICKENALF = ITEMS.register("chickenalf",
            () -> new Item(new Item.Properties().food(ModFoods.CHICKENALF)));






    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
