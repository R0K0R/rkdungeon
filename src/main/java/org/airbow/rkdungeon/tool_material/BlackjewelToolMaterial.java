package org.airbow.rkdungeon.tool_material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import org.airbow.rkdungeon.item.ModItems;

public class BlackjewelToolMaterial implements ToolMaterial {

    public static final BlackjewelToolMaterial INSTANCE
            = new BlackjewelToolMaterial();

    @Override
    public int getDurability() {
        return 1631;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.BLACKJEWEL);
    }
}