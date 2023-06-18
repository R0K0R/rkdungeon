package org.airbow.rkdungeon.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static org.airbow.rkdungeon.Rkdungeon.MOD_ID;

public class ModEffects {
    public static StatusEffect ELECTRIC_SHOCK;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, name),
                new ElectricShockEffect(StatusEffectCategory.HARMFUL, 16777045));
    }

    public static void registerEffects() {
        ELECTRIC_SHOCK = registerStatusEffect("electric_shock");
    }
}
