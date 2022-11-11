package net.S_Rko.rkdungeon.util;

import net.S_Rko.rkdungeon.item.ModItems;
import net.S_Rko.rkdungeon.item.custom.FireSwordItems;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;

import static net.S_Rko.rkdungeon.item.ModItems.FIRE_SWORD;
import static net.S_Rko.rkdungeon.item.ModItems.UPGRADED_TRIDENT;
import static net.minecraft.client.item.ModelPredicateProviderRegistry.register;

public class ModModelPredicateProvider {
    public static void registerModModels() {
        registerFireSword(FIRE_SWORD); registerUpgradedTrident(UPGRADED_TRIDENT);
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
