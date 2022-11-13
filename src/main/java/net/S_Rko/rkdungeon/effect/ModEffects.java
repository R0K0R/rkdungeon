package net.S_Rko.rkdungeon.effect;

import net.S_Rko.rkdungeon.rkdungeon;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEffects {
    public static StatusEffect ELECTRIC_SHOCK;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(rkdungeon.MOD_ID, name),
                new ElectricShockEffect(StatusEffectCategory.HARMFUL, 16777045));
    }

    public static void registerEffects() {
        ELECTRIC_SHOCK = registerStatusEffect("electric_shock");
    }
}
