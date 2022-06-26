package net.S_Rko.rkdungeon.item;

import net.S_Rko.rkdungeon.rkdungeon;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup RKDUNGEON = FabricItemGroupBuilder.build(new Identifier(rkdungeon.MOD_ID, "rkdungeon"), () -> new ItemStack(ModItems.BLACKJEWEL));
}