package org.airbow.rkdungeon.tool_material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import org.airbow.rkdungeon.item.ModItems;

public class SapphireToolMaterial implements ToolMaterial {

    public static final SapphireToolMaterial INSTANCE = new SapphireToolMaterial();

    @Override
    public int getDurability() {
        return 1561;
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
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.SAPPHIRE);
    }
}