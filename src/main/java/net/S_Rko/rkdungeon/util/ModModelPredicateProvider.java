package net.S_Rko.rkdungeon.util;

import net.S_Rko.rkdungeon.item.ModItems;
import net.S_Rko.rkdungeon.item.custom.FireSwordItems;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;

import static net.S_Rko.rkdungeon.item.ModItems.FIRE_SWORD;
import static net.minecraft.client.item.ModelPredicateProviderRegistry.register;

public class ModModelPredicateProvider {
    public static void registerModModels() {
        registerFireSword(FIRE_SWORD);
    }

    public static void registerFireSword(Item fireSword) {
        register(fireSword, new Identifier("off"), (stack, world, entity, seed) -> {
            return FireSwordItems.onMainHand(stack) && FireSwordItems.isUsable(stack) ? 0.0F : 1.0F;
        });
    }
}