package net.S_Rko.rkdungeon.tool_material;

import net.S_Rko.rkdungeon.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class UpgradedTridentToolMaterial implements ToolMaterial {

    public static final UpgradedTridentToolMaterial INSTANCE = new UpgradedTridentToolMaterial();

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
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 1;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}