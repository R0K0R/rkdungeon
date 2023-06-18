package org.airbow.rkdungeon.item.custom;

import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;

public class ElectricArrowItem extends ArrowItem {
    public ElectricArrowItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getDefaultStack() {
        return PotionUtil.setPotion(super.getDefaultStack(), Potions.LEAPING);
    }
}
