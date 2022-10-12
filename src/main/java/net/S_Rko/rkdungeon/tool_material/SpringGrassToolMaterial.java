package net.S_Rko.rkdungeon.tool_material;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SpringGrassToolMaterial implements ToolMaterial {

    public static final SpringGrassToolMaterial INSTANCE
            = new SpringGrassToolMaterial();

    @Override
    public int getDurability() {
        return 131;
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
        return 14;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.FERN);
    }
}