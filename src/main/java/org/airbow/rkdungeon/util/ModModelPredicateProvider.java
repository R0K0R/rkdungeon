package org.airbow.rkdungeon.util;

import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import org.airbow.rkdungeon.item.custom.FireSwordItems;

import static net.minecraft.client.item.ModelPredicateProviderRegistry.register;
import static org.airbow.rkdungeon.item.ModItems.FIRE_SWORD;

public class ModModelPredicateProvider {
    public static void registerModModels() {
        registerFireSword(FIRE_SWORD);
    }

    public static void registerFireSword(Item fireSword) {
        register(fireSword, new Identifier("on"), (stack, world, entity, seed) -> {
            return !(FireSwordItems.onHand(stack) && FireSwordItems.isUsable(stack)) ? 0.0F : 1.0F;
        });
    }

    public static void registerUpgradedTrident(Item trident)  {
        register(trident, new Identifier("throwing"), (stack, world, entity, seed) -> {
            return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
        });
    }
}
