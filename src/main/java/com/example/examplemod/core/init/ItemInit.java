package com.example.examplemod.core.init;

import com.example.examplemod.LegendaryEndSword;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create( ForgeRegistries.ITEMS, LegendaryEndSword.MOD_ID );

    public static final RegistryObject<Item> SWORD_ITEM =  ITEMS.register("legendarysword",
            () -> new Item(new Item.Properties().group(ItemGroup.COMBAT)));
}
