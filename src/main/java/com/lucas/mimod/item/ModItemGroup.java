package com.lucas.mimod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup MIMOD_TAB = new ItemGroup("mimodTab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PADDLE.get());
        }
    };
}
