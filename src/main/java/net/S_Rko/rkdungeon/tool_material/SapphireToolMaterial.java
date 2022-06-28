package net.S_Rko.rkdungeon.tool_material;

import net.S_Rko.rkdungeon.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SapphireToolMaterial implements ToolMaterial {

    public static final SapphireToolMaterial INSTANCE = new SapphireToolMaterial();

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
        return Ingredient.ofItems(ModItems.SAPPHIRE);
    }
}