package net.S_Rko.rkdungeon.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {
    BLACKJEWEL("blackjewel", 30, new int[]{3, 6, 7, 3}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1.5f, 0.05f,
            ModArmorMaterial::getBlackjewel),
    SAPPHIRE("sapphire", 30, new int[]{3, 7, 7, 3}, 17,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5f, 0.075f,
            ModArmorMaterial::getSapphire),
    RUBY("ruby", 30, new int[]{2, 4, 5, 2}, 9,
    SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f, 0f,
    ModArmorMaterial::getRuby);

    private static final int[] BASE_DURABILITY;
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy<Ingredient>(repairIngredientSupplier);
    }

    private static Ingredient getBlackjewel() {
        return Ingredient.ofItems(ModItems.BLACKJEWEL);
    }

    private static Ingredient getSapphire() {
        return Ingredient.ofItems(ModItems.SAPPHIRE);
    }

    private static Ingredient getRuby() {
        return Ingredient.ofItems(ModItems.RUBY);
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    static {
        BASE_DURABILITY = new int[]{13, 15, 16, 11};
    }
}
