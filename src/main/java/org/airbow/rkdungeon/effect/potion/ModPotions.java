package org.airbow.rkdungeon.effect.potion;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.airbow.rkdungeon.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;

public class ModPotions {
    public static Potion ELECTRIC_SHOCK;

    public ModPotions() {

    }

    private static Potion register(String name, Potion potion){
        return (Potion) Registry.register(Registries.POTION, name, potion);
    }

    static {
        ELECTRIC_SHOCK = register("electric_shock", new Potion(new StatusEffectInstance[]{new StatusEffectInstance(ModEffects.ELECTRIC_SHOCK, 4)}));
    }
}
