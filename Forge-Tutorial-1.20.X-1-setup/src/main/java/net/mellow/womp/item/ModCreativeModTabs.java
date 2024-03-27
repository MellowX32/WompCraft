package net.mellow.womp.item;

import net.mellow.womp.WompCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WompCraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WOMP_TAB = CREATIVE_MODE_TABS.register("womp_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.ORB_HELMET.get()))
                    .title(Component.translatable("creativetab.womp_tab"))
                    .displayItems((itemDisplayParameters, output) -> {


                        output.accept(ModItems.ORB_HELMET.get());
                        output.accept(ModItems.ORB_CHESTPLATE.get());
                        output.accept(ModItems.ORB_LEGGINGS.get());
                        output.accept(ModItems.ORB_BOOTS.get());

                        output.accept(ModItems.ALFREDO.get());

                        output.accept(ModItems.SHRIMPAL.get());
                        output.accept(ModItems.CHICKENALF.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
